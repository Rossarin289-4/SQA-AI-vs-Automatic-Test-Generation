package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:7>", "<null>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "false", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<null>", "--1", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:3>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:11>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:3>", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:14>", "<sample:9>", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<null>", "<sample:8>", "<sample:1>"}}), new String[][]{{"_withValueTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:4>", "<sample:5>", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<sample:8>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:3>", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:12>", "true", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:0>", "<sample:5>", "true", "<sample:11>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "false", "<null>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<null>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:6>", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:13>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:8>", "<sample:10>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.PropertyBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:2>", "true", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<b:true>", "10x1F", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:9>", "<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<null>", "<sample:9>", "true", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:8>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:10>", "<sample:5>", "false", "<sample:1>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:12>", "<sample:8>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:3>", "<sample:5>", "<sample:6>", "true", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<null>", "<sample:14>", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:10>", "<sample:11>", "true", "<sample:7>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:9>", "<sample:5>", "<sample:5>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object[]", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:7>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeOverlappingTypeIds", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "java.util.List"}, new String[]{"<sample:0>", "<null>", "<sample:3>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>", "false", "<sample:6>", "<sample:4>", "<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.MapSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:14>", "<sample:13>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:2>", "<sample:2>", "false", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:7>", "<sample:5>", "true", "<null>", "<sample:11>", "<sample:2>"}}), new String[][]{{"findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:10>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:13>", "false", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:3>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "<sample:6>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:2>", "<sample:8>"}}), new String[][]{{"isUnwrappingSerializer", "", "6"}, {"properties", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<sample:13>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:6>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:14>", "<sample:6>", "false", "<sample:12>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeOverlappingTypeIds", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder,java.util.List", "<sample:11>", "<sample:12>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:15>", "<sample:4>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:11>", "<sample:11>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:11>", "<sample:5>", "<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:4>", "<sample:10>", "true", "<null>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "<sample:14>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:3>", "<sample:9>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:4>", "<sample:8>", "false", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<sample:2>", "<sample:10>", "true", "<sample:3>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:3>", "<sample:5>", "true", "<sample:1>", "<sample:10>"}}, 3), new String[][]{{"getDelegatee", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:11>", "<sample:3>", "true", "<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<null>", "<sample:3>", "false", "<sample:3>", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"isEmpty", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:8>", "<sample:8>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:5>", "<sample:9>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "<sample:8>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:10>", "<sample:14>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:7>", "<sample:0>", "false", "<sample:3>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:1>", "true", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:11>", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<null>", "false", "<sample:0>", "<sample:1>", "<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:14>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:5>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>", "<sample:5>", "true", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:12>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "<sample:8>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:3>", "<sample:5>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "true", "<sample:2>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:12>", "true", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<null>", "<sample:5>", "true", "<null>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:13>", "<sample:1>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:8>", "<sample:13>", "false", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>", "<sample:9>", "true", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:4>", "<sample:2>", "<sample:5>", "false", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:12>", "<sample:2>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:8>", "<sample:4>", "false", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:2>"}}, 2), new String[][]{{"serializeContents", "java.lang.Iterable,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-1446704358", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "true", "<sample:1>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:6>", "true", "<sample:2>", "<sample:0>", "<sample:0>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:2>", "<sample:8>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:1>", "<sample:8>", "false", "<sample:5>", "<null>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:12>", "<empty>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:14>", "true", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:5>", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "customSerializers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:6>", "<sample:8>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:9>", "<sample:2>", "false", "<sample:7>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<i:2>", ".10x1F", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>", "true", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "false", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "false", "<sample:6>", "<sample:6>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:15>", "<sample:10>", "<sample:9>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:14>", "<sample:11>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:10>", "<sample:11>", "true"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3), new String[][]{{"setTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "false", "<sample:0>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:10>", "<sample:11>", "false", "<sample:10>"}, false, 1, new String[][]{}, 3), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Iterator {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Iterator, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], ge...#504#1559015214", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:5>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:14>", "<sample:12>", "<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:6>", "<sample:10>", "false", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<sample:9>", "<sample:7>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:8>", "<sample:6>", "<sample:0>", "<sample:7>", "true", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:11>", "<sample:14>", "<sample:6>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:14>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:2>", "<sample:8>", "false", "<sample:12>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<null>"}}, 3), new String[][]{{"findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:3>", "true", "<sample:11>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "<sample:12>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "true", "<sample:4>", "<sample:4>"}, false, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>", "<sample:9>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:11>", "<sample:9>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:12>", "<sample:5>", "false", "<sample:4>", "<sample:10>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "false", "<null>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:14>", "<sample:8>"}}, 3), new String[][]{{"_withValueTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "1"}, {"getContentType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:9>", "<sample:3>", "false"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:9>", "<sample:3>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:6>", "true", "<null>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:1>", "<sample:4>", "<sample:2>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:13>", "true", "<null>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:9>", "<sample:11>", "false", "<sample:6>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:8>", "<sample:2>", "false", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:1>", "<sample:2>", "false", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:2>", "<sample:13>", "false", "<sample:1>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:12>", "<sample:10>", "false"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:14>", "<sample:2>", "<sample:0>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<s:b>", "\u00e9a>b</a>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:14>", "<sample:16>", "<sample:5>", "true"}}, 1), new String[][]{{"getClassInfo", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>", "false", "<sample:4>", "<sample:11>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:16>", "<sample:1>", "<sample:10>", "false"}}, 3), new String[][]{{"usesObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:8>", "<sample:3>", "true", "<sample:15>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:0>", "<sample:0>", "false", "<sample:0>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:10>", "<sample:3>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "false", "<sample:5>", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "<sample:4>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:14>", "<sample:6>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:7>", "<sample:1>", "true", "<sample:4>", "<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>", "<sample:3>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "<sample:14>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:6>", "<sample:8>", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:11>", "<sample:4>", "<sample:6>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:11>", "<sample:2>", "false", "<sample:4>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"getSerializationType", "", "6"}, {"isAbstract", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>", "<sample:1>", "true", "<sample:8>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:13>", "false", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:10>", "<sample:3>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:4>", "<sample:3>", "true", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:17>", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:5>", "<sample:7>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:4>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:1>", "<sample:7>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", new String[]{"com.fasterxml.jackson.databind.ser.BeanSerializerModifier"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>", "<sample:5>", "true", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:4>", "true", "<sample:2>", "<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>", "<sample:7>", "true", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:2>", "<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<null>", "<sample:8>", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:9>", "<sample:1>", "<sample:3>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>", "false", "<null>", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:4>", "<sample:6>", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<null>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>", "true", "<null>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:7>", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:11>", "<sample:8>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:6>", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:12>", "<sample:1>", "<sample:8>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>", "<sample:9>", "true", "<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.IterableSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "true", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<null>", "<sample:4>", "<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>", "true", "<sample:5>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "<sample:7>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:9>", "<sample:3>", "true", "<sample:4>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:8>", "<null>", "false", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:10>", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "false", "<sample:8>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:0>", "<sample:9>", "false"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:15>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<null>", "<sample:9>", "true", "<sample:7>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:9>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:9>", "<null>", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:2>", "<sample:3>", "<sample:6>", "false", "<sample:5>"}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:0>", "<sample:5>", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>", "true", "<sample:2>", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:14>", "<sample:4>", "true", "<sample:8>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:12>", "<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:0>", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>", "<sample:0>"}}), new String[][]{{"setFilterId", "java.lang.Object", "7"}, {"getBeanDescription", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:10>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:6>", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:12>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<d:1.5>", "ntll", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:3>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSuppressableContentValue", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:11>", "<sample:0>", "true"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:5>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=true, hasSerializerModifiers=true, hasSerializers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "getFactoryConfig", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<sample:0>", "1.5f", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:0>", "<sample:1>", "false", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:11>", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>", "<sample:3>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>", "<sample:5>", "true", "<sample:15>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", new String[]{"com.fasterxml.jackson.databind.ser.BeanSerializerModifier"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:9>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:7>", "<sample:9>", "true", "<sample:0>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:13>", "false", "<sample:2>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "false", "<sample:7>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "customSerializers", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:10>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:5>", "false", "<sample:6>"}, false), new String[][]{{"isEmpty", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:12>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:1>", "<sample:4>", "true", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:8>", "<sample:14>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:6>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:9>", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:5>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:9>", "<sample:3>", "<sample:10>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>", "<sample:6>", "<sample:2>", "<sample:6>", "false", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:4>", "<sample:6>", "<sample:4>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "true", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:5>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:14>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<null>", "<sample:4>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>", "<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:4>", "<sample:8>", "true", "<sample:6>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "true", "<sample:4>", "<sample:7>"}, false), new String[][]{{"isUnwrappingSerializer", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:6>", "<sample:3>", "<sample:2>", "false", "<sample:6>"}}), new String[][]{{"hasNext", "", "2"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:11>", "<sample:4>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ToStringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:7>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:11>"}}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:2>", "<sample:7>", "true", "<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:10>", "<sample:11>", "false", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:13>", "<sample:1>", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:10>", "<sample:2>", "<sample:2>"}}), new String[][]{{"getContentType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#761#2136709350", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:3>", "<sample:8>", "false", "<sample:5>", "<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "false", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:7>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:0>", "<sample:9>", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:7>", "<sample:0>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<sample:1>", "h", "<sample:1>"}}), new String[][]{{"hasSerializers", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:3>", "<sample:11>", "false", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "<sample:6>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "false", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:6>", "<sample:8>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:7>", "<sample:14>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:14>", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:15>", "false", "<sample:2>", "<sample:8>"}, false), new String[][]{{"getContentSerializer", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:3>", "<sample:7>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:3>", "<sample:9>", "false", "<sample:7>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:13>", "<sample:12>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<null>", "TTI", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:1>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>", "<sample:10>", "false", "<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:10>", "false", "<sample:1>", "<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object[]", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:13>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<null>", "<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:16>", "<null>", "true", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<i:0>", "0x123456789", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}), new String[][]{{"findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:6>", "true", "<sample:6>", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>", "false", "<sample:0>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:6>", "<sample:5>", "false", "<sample:4>", "<sample:5>", "<sample:8>"}}), new String[][]{{"serializeTypedContents", "java.lang.Object[],com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:1>", "<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericS...#667#-278115368", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", "com.fasterxml.jackson.databind.BeanDescription", "<sample:6>"}}), new String[][]{{"serializers", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:0>", "false", "<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.IterableSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:3>", "<sample:4>", "false", "<sample:9>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:14>", "<sample:13>", "<sample:2>", "false", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:8>", "<sample:4>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:13>", "<sample:15>", "<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:11>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>"}, false, 6, new String[][]{}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"array\",\"items\":{\"type\":\"any\"}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#1809547161", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:3>", "<sample:8>", "<sample:5>", "false", "<sample:7>"}}), new String[][]{{"getContentSerializer", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:7>", "<sample:8>", "true", "<sample:7>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:5>", "<sample:10>", "true", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:12>", "true", "<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:9>", "<sample:12>", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:6>"}}), new String[][]{{"getDelegatee", "", "0"}, {"serializeContents", "java.util.List,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeOverlappingTypeIds", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "java.util.List"}, new String[]{"<sample:3>", "<sample:9>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "true", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:2>", "<empty>"}, false, 6, new String[][]{}), new String[][]{{"removeInternalSetting", "java.lang.Object", "4"}, {"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>", "false", "<sample:9>"}, false, 4, new String[][]{}), new String[][]{{"hasSingleElement", "java.util.Iterator", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:10>", "<sample:12>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:6>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-1446704358", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<sample:1>", "<sample:2>", "false", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:14>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:13>", "false", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:13>", "<sample:11>", "<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"isUnwrappingSerializer", "", "6"}, {"isUnwrappingSerializer", "", "4"}, {"getDelegatee", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:14>", "false", "<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:11>", "<sample:5>", "true", "<sample:14>", "<sample:9>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.util.List", "6"}, {"getDelegatee", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:6>", "<sample:5>"}, true), new String[][]{{"toCanonical", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:14>", "<sample:1>", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:7>", "true", "<sample:16>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", "com.fasterxml.jackson.databind.BeanDescription", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:9>", "<sample:8>", "<sample:6>"}}), new String[][]{{"getContentType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-1446704358", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:16>", "<sample:10>", "<sample:0>", "true", "<sample:9>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:3>", "<sample:9>", "false", "<sample:0>", "<sample:3>", "<sample:6>"}}), new String[][]{{"hasSingleElement", "java.util.Map$Entry", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:5>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:4>", "<sample:5>", "true", "<sample:14>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>", "<sample:2>", "<sample:14>", "true", "<sample:4>", "<null>"}}), new String[][]{{"isEmpty", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:16>", "<sample:0>", "true", "<sample:6>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"withValueTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:13>", "false", "<sample:5>", "<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:13>", "false", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:12>", "<sample:1>", "false", "<sample:9>", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:11>", "<sample:5>", "true", "<sample:4>", "<sample:13>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "true", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "customSerializers", ""}}), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:11>", "<sample:9>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"getTypeSerializer", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer", actual.getClass().getName());
  assertEquals("{getPropertyName=null, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:4>", "<sample:3>", "true", "<sample:11>", "<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"isEmpty", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "false", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=true, hasSerializerModifiers=true, hasSerializers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"getContentType", "", "2"}, {"isConcrete", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#761#2136709350", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:9>", "<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:14>", "<sample:6>", "true"}}), new String[][]{{"usesObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:13>", "<sample:5>", "<sample:8>"}}), new String[][]{{"createDummy", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:16>", "<sample:8>", "<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<null>", "<sample:8>", "true", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:4>"}, false), new String[][]{{"buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "<sample:11>", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "false", "<sample:1>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:9>", "<sample:14>", "false", "<sample:3>", "<sample:6>"}}), new String[][]{{"isEmpty", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<sample:8>", "<sample:5>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:1>", "<sample:10>", "true", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:14>"}}), new String[][]{{"createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>", "<sample:8>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:15>", "<null>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:8>", "<sample:6>", "false", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<sample:9>", "<sample:10>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:13>", "<sample:1>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:14>", "<sample:7>", "false", "<sample:9>", "<sample:12>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:1>", "<sample:7>", "false", "<sample:11>", "<null>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:13>", "<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<null>"}, false, 3, new String[][]{}), new String[][]{{"withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:13>", "<sample:14>", "<sample:13>", "false"}}), new String[][]{{"isRequired", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "true", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:6>", "<sample:0>"}}), new String[][]{{"isEmpty", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:0>", "<sample:13>", "false", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:13>", "<sample:0>"}}), new String[][]{{"getContentType", "", "7"}, {"toCanonical", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:11>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:10>", "<sample:2>", "false", "<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"hasSingleElement", "java.lang.Iterable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:13>", "<sample:9>", "true"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:0>", "<sample:7>"}, true), new String[][]{{"isThrowable", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:7>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<s:XH>", "TTLE", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BasicSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:1>", "<sample:6>", "true", "<sample:6>", "<sample:3>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
