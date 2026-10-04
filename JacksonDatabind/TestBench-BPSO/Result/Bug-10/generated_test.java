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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:7>", "<sample:2>", "<empty>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>", "<sample:6>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:8>", "<sample:5>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:4>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:5>", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:0>", "<sample:4>", "false", "<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:3>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:0>", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:8>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:4>", "<sample:3>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "<sample:9>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:14>", "<sample:1>", "<sample:4>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:6>", "<sample:5>", "<null>", "false", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:4>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:6>", "<sample:9>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "true", "<sample:0>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:2>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:8>"}}), new String[][]{{"findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "3"}, {"withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "3"}, {"getFactoryConfig", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=false, hasSerializerModifiers=false, hasSerializers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:1>", "<sample:9>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:5>", "<sample:3>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "<sample:10>", "true"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:7>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<null>", "<sample:4>", "false", "<sample:2>", "<sample:2>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>", "<sample:1>", "false", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.IterableSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:3>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<null>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:4>", "<sample:9>", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:0>", "<sample:5>", "true", "<sample:7>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:10>", "<null>", "true"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:8>", "<sample:5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<null>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:7>", "<sample:3>", "true", "<sample:3>", "<sample:3>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:1>", "<sample:5>", "<sample:5>", "false"}}, 3), new String[][]{{"setAnyGetter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<s:>", "0x2F", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:4>", "<null>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:1>", "<sample:0>", "false", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:8>", "<sample:8>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:0>", "<sample:6>", "<sample:5>", "true", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<i:1>", "1e10\n", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "false", "<sample:2>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:11>", "<sample:6>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<s:,>", "1.1234567890123457", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>", "<sample:6>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:8>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:0>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 3), new String[][]{{"withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>", "<sample:2>", "false", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:1>", "<sample:3>", "false", "<null>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:6>", "<sample:6>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getBeanDescription", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<sample:5>", "false"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<null>", "<sample:7>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:7>", "<sample:9>", "false", "<sample:2>", "<sample:0>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:12>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:0>", "false", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:8>", "<sample:6>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:5>", "<sample:0>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:7>", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>", "false", "<sample:5>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>", "<sample:6>", "true", "<sample:0>", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:11>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<s:tc>", "<sample:9>", "<sample:6>", "<sample:5>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:6>", "<sample:3>", "false", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:7>", "<sample:8>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:10>", "<sample:7>"}}, 2), new String[][]{{"createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>", "<sample:10>", "<sample:4>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:9>", "false", "<sample:8>", "<sample:5>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.MapSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:9>", "<sample:2>", "<sample:3>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<d:1.5>", "<sample:0>", "<sample:3>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:8>", "<sample:5>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<sample:5>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:5>", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:2>", "<sample:2>", "true", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "true", "<sample:7>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:8>", "<sample:11>", "false", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:2>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:0>", "<sample:9>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "true", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:10>", "<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:8>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "<sample:6>", "false"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:0>", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>", "<sample:5>", "true", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:8>", "<sample:0>"}}, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:4>", "<sample:1>", "<sample:0>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:5>", "<sample:5>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:11>", "<sample:5>", "<sample:3>", "false", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:2>", "<sample:1>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:7>", "true", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:8>", "<sample:1>", "true", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "true", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:0>", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<s:b>", "123456789012345678901", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:3>", "<sample:7>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "false", "<sample:5>", "<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>", "false", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.IterableSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=false, hasSerializerModifiers=false, hasSerializers=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"getSerializationType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:6>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.PropertyFilter", "<s:key>", "<sample:2>", "<sample:8>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:0>", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:7>", "<sample:5>", "false", "<sample:1>", "<sample:3>", "<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>"}, false), new String[][]{{"createDummy", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "<sample:8>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "true", "<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:11>", "<sample:2>", "<sample:10>"}}), new String[][]{{"hasSingleElement", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:3>", "<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"getMetadata", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:12>", "<sample:6>", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:3>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:1>", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:1>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:4>"}}), new String[][]{{"createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "false", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>", "<sample:6>", "true", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:9>", "true", "<sample:10>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:0>", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "<sample:7>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:5>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:5>", "false", "<sample:2>"}, false), new String[][]{{"serialize", "java.util.Iterator,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<null>", "<sample:3>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:2>", "<sample:8>", "false", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<d:1.5>", "<sample:3>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:8>", "<sample:5>", "true", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>", "<sample:4>", "false", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:10>", "<sample:3>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:10>", "<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:4>", "<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<s:b>", "<sample:2>", "<sample:2>", "<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<null>", "0 ", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:6>", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-2097152>", "<sample:4>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.PropertyFilter", "<i:-2>", "<sample:0>", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<null>", "<sample:2>", "false"}}), new String[][]{{"setAnyGetter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "7"}, {"getObjectIdWriter", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:3>"}, false), new String[][]{{"createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<s:key>", "<null>", "<sample:6>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:E>", "<sample:2>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:3>"}, false), new String[][]{{"withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<null>", "<sample:0>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:7>"}}), new String[][]{{"withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "false", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:1>", "<sample:1>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "<sample:0>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:5>", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<sample:8>", "<sample:3>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:5>", "<sample:2>", "false", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:6>", "<sample:7>", "<sample:2>", "false", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<sample:1>", "a b", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:8>", "<sample:7>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:8>", "<sample:7>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "false", "<null>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-45.0>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:8>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:6>", "<sample:9>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}}), new String[][]{{"getContextAnnotation", "java.lang.Class", "6"}, {"getFullName", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", new String[]{"com.fasterxml.jackson.databind.ser.BeanSerializerModifier"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "<sample:3>", "false"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:6>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:2>", "<sample:5>", "<sample:0>", "true", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:5>", "<null>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:4>", "<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:2>", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:7>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:2>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:6>", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#565#-1574031991", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:9>", "<null>", "true"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:4>"}}), new String[][]{{"buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:0>", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:2>"}, false), new String[][]{{"getSerializedName", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals(" {getValue=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:12>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:7>"}, true), new String[][]{{"withTypeHandler", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSign...#693#-1256557226", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:2>", "<sample:8>", "false", "<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<null>", "<sample:0>", "<sample:6>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:9>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:9>", "<sample:6>", "<sample:0>", "<null>", "false", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<null>", "<sample:7>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:5>", "<sample:1>", "true", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:14>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>", "<sample:2>", "true", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.PropertyBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:8>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "false", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView", actual.getClass().getName());
  assertEquals("property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.BooleanSerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, isUnw...#231#959205887", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>"}, false, 7, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>", "<sample:4>", "false", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<i:5>", "<sample:7>", "<sample:4>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.PropertyFilter", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:6>", "<sample:5>"}, true), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "true", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<b:true>", "<sample:7>", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>", "<sample:7>", "false", "<sample:2>", "<sample:4>"}}, 3), new String[][]{{"getBeanDescription", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", actual.getClass().getName());
  assertEquals("{hasKnownClassAnnotations=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<i:27>", "-13", "<sample:1>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:0>", "<sample:6>"}, true), new String[][]{{"withContentValueHandler", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "false", "<sample:2>", "<sample:0>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:5>"}, false), new String[][]{{"buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:8>", "<sample:4>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:5>", "<sample:6>", "true", "<sample:5>"}, false, 0, null, 3), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:12>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:2>", "<sample:9>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}), new String[][]{{"buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "true", "<sample:3>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:11>", "<sample:5>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:10>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:14>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:2>", "<sample:5>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<i:0>", "<null>", "<sample:4>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:4>", "<sample:10>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:5>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:12>", "<sample:1>", "<sample:3>", "false", "<sample:4>", "<sample:0>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:8>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "true", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:11>", "false", "<sample:5>", "<sample:0>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=true, hasSerializerModifiers=true, hasSerializers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>", "<sample:5>", "true", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:4>", "<sample:1>", "<sample:11>", "true"}}, 2), new String[][]{{"createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<s:>", "-,1", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>", "<sample:2>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<null>", "<sample:9>", "true"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:5>", "<empty>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"hasSerializerModifiers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:3>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:4>"}}), new String[][]{{"findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:2>"}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:3>"}, false), new String[][]{{"buildEnumSetSerializer", "com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>", "<sample:6>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>"}, false), new String[][]{{"setFilteredProperties", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]", "6"}, {"hasProperties", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:7>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:9>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:10>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:3>", "<sample:0>", "<sample:6>"}}), new String[][]{{"rename", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>a{\"a\":1}' (virtual, no static serializer) {getName=<a><b>t</b></a>a{\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUn...#232#1525917587", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:8>", "<sample:4>", "<null>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:2>"}, true), new String[][]{{"withTypeHandler", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-2093806568", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.PropertyFilter", "<i:-1>", "<sample:4>", "<sample:4>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"getFactoryConfig", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=true, hasSerializerModifiers=false, hasSerializers=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:2>", "<sample:6>"}}), new String[][]{{"isArrayType", "", "7"}, {"isContainerType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:4>", "<sample:9>", "<sample:5>"}, false, 4, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>"}, true), new String[][]{{"getGenericSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:7>", "<sample:9>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:2>", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:7>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:4>", "<sample:7>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:6>", "<sample:3>", "<sample:2>", "true", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<null>", "<sample:10>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:1>", "<sample:2>", "<sample:5>", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:6>", "<sample:5>", "false", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:6>", "<sample:7>", "true", "<sample:6>"}}), new String[][]{{"serializers", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:8>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:6>", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:6>", "<sample:6>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"hasKeySerializers", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndFilter", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.PropertyFilter"}, new String[]{"<sample:0>", "<sample:5>", "<sample:7>", "<sample:7>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:8>", "<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:0>", "<sample:4>", "<null>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:9>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:6>", "<sample:9>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:1>", "<sample:10>", "false", "<sample:5>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ToStringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generate...#756#-732388926", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:6>", "<sample:7>", "true", "<sample:7>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", "com.fasterxml.jackson.databind.BeanDescription", "<null>"}}), new String[][]{{"withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:3>", "<sample:2>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:10>", "<sample:6>", "<null>"}}, 3), new String[][]{{"getFactoryConfig", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=true, hasSerializerModifiers=true, hasSerializers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:0>", "<sample:11>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:9>", "<sample:1>", "<null>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:8>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:6>", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:1>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.AnyGetterWriter", "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:s>", "<sample:1>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.AnyGetterWriter", "getAndSerialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:6>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:2>"}}), new String[][]{{"getFactoryConfig", "", "7"}, {"hasKeySerializers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:11>", "<sample:9>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:7>", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false), new String[][]{{"hasSerializerModifiers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:11>", "<sample:7>", "<sample:0>", "false"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<null>", "<sample:3>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:10>", "<sample:4>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:1>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:2>", "false", "<sample:4>", "<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"serializeContents", "java.lang.Object[],com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:10>", "<sample:9>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "true", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "false", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>", "<sample:12>", "<null>"}}), new String[][]{{"isUnwrappingSerializer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"getParameterSource", "", "7"}, {"getErasedSignature", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:3>", "<sample:4>", "false", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:8>", "<sample:4>", "true"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.util.Iterator", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasSerializerModifiers", "", "7"}, {"serializers", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:7>", "<sample:3>"}, false), new String[][]{{"isFinal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "false", "<sample:4>", "<sample:7>"}, false, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:0>", "<sample:2>", "true", "<sample:1>", "<sample:6>", "<sample:10>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:10>", "<sample:4>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:7>", "<sample:3>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
