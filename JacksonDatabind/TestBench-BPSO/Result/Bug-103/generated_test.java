package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getAttribute", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:7>", "<sample:2>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<null>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:5>", "<sample:7>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:0>", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:-0.05>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.05", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructSetterlessProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:1>", "<sample:9>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<null>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getNullValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:4>", "<sample:8>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:7>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:3>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:6>", "<i:-20>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getContextualType", ""}, {"com.fasterxml.jackson.databind.DatabindContext", "getTypeFactory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[any property on class java.lang.String] {hasValueDeserializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findClass", new String[]{"java.lang.String"}, new String[]{"n5.a"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getConfig", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "handleWeirdNativeValue", "com.fasterxml.jackson.databind.JavaType,java.lang.Object,com.fasterxml.jackson.core.JsonParser", "<sample:6>", "<s:b>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "_"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportInputMismatch", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Object[]", "<sample:3>", "TITLE010", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[any property on class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {hasValueDeserializer=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "verifyMustOverride", new String[]{"java.lang.Class", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<s:>", ":c "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getActiveView", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "hasSomeOfFeatures", "int", "3"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:7>", "<b:true>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "hasClass", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<s:b>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:8>", "]..[", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:1>", "Aguimens #0"}, {"com.fasterxml.jackson.databind.DatabindContext", "getAnnotationIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "wrapperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getDefaultValue", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "buildWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.introspect.AnnotatedMember,boolean", "<sample:4>", "<sample:5>", "<sample:9>", "<sample:2>", "<sample:6>", "<sample:6>", "<sample:2>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:11>", "<sample:5>", "<sample:10>", "<sample:6>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "fromUnexpectedIOE", new String[]{"java.io.IOException"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Unexpected IOException (of type java.io.IOException): 0 {getLocalizedMessage=Unexpected IOException (of type java.io.IOException): 0, getMessage=Un...#445#779222097", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"1039", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "invalidTypeIdException", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String", "<null>", "Not b subtype", " of canstructor "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "closeOnFailAndThrowAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.io.Closeable", "java.lang.Exception"}, new String[]{"<sample:5>", "<empty>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "{\"a\":1}"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:5>", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "214)7-83648", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.Class", "java.util.Map"}, new String[]{"<sample:7>", "<null>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addBeanProps", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "<sample:4>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "getPath", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JsonMappingException", "clearLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: sample {getLocalizedMessage=sample, getMessage=sample, getOriginalMessage=sample, getPathReference=, getStackTrace=[java.base/jdk.internal.reflect....#249#-372276340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleWeirdKey", new String[]{"java.lang.Class", "java.lang.String", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "java/util.Deque", "125", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "mappingException", "java.lang.String", "]..5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", "java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "1ee101.5e300", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findAnySetterAccessor", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_createConverter", "java.lang.Object", "<d:1.467>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "hasGetterSignature", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findDeserializationConverter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findAnySetterAccessor", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:7>", "<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:0>", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "setNullKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "defaultValue", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasDeserializationFeatures", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:7>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "isNonStaticInnerClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getFactoryMethods", ""}, {"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findPOJOBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericBase {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"Agumennt #0", "<i:-10>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getDefaultNullValueSerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findNonContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "instantiationException", "java.lang.Class,java.lang.String", "<sample:1>", "00"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getFactory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "findSuperTypes", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:10>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "materializeAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:4>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<s:/b>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "invalidTypeIdException", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String", "<sample:4>", "PT1:r[]", "1.1234567"}, {"com.fasterxml.jackson.databind.DeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:15>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-2137834440000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastR...#655#1218230938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getClassDescription", new String[]{"java.lang.Object"}, new String[]{"<i:-40>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`java.lang.Integer`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:9>", "<sample:0>", "0x123456789", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "reportBadTypeDefinition", "com.fasterxml.jackson.databind.BeanDescription,java.lang.String,java.lang.Object[]", "<sample:8>", "Aguimens #02000", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "prependPath", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<d:-1.5>", ")1.5e300"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.JsonMappingException", "_appendPathDesc", "java.lang.StringBuilder", "<sample:3>"}, {"com.fasterxml.jackson.databind.JsonMappingException", "getPathReference", "java.lang.StringBuilder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException:  (through reference chain: java.lang.Double[\")1.5e300\"]) {getLocalizedMessage= (through reference chain: java.lang.Double[\")1.5e300\"]), getMessage=...#421#-630618870", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:10>", "2020-01-01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#300#-1196635356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>", "<sample:5>", "<sample:0>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:0>", "<sample:14>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportWrongTokenException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:4>", "<sample:5>", "--11E-5", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:9>", "Gxelio, Word"}, {"com.fasterxml.jackson.databind.DeserializationContext", "setAttribute", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-128>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:9>", "<sample:12>", "<sample:8>", "<null>", "<sample:3>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:8>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_throwAsIOE", "java.lang.Exception", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleInstantiationProblem", new String[]{"java.lang.Class", "java.lang.Object", "java.lang.Throwable"}, new String[]{"<sample:5>", "<null>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "_desc", "java.lang.String", "1.25s"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "assignIndex", "int", "13"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=13, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-442579244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:10>", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:1>", "<sample:14>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>", "<sample:2>", "<null>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object,java.lang.Object", "<sample:0>", "<i:-60>", "<s:ky>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.SettableAnyProperty", actual.getClass().getName());
  assertEquals("[any property on class generated.algorithm.SearchInputFactory_scaffolding$TypeSamples] {hasValueDeserializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[any property on class generated.algorithm.SearchInputFactory_scaffolding$TypeSamples] {hasValueDeserializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_reportUnwrappedCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:10>", "<sample:5>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findExpectedFormat", new String[]{"com.fasterxml.jackson.annotation.JsonFormat$Value"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findSingleArgConstructor", "java.lang.Class[]", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getConstructors", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"Arygment #"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<i:-20>", "e5.a", "<sample:11>"}, {"com.fasterxml.jackson.databind.DatabindContext", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<null>", "<s:Akeyy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Arygment #", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:10>", "<sample:7>", "<sample:10>", "<sample:2>", "<sample:8>", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>", "<i:2>", "<sample:6>", "<sample:9>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<d:2.934>", "50\""}, true), new String[][]{{"getPathReference", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("java.lang.Double[\"50\"\"]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.1234567r8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findInjectableValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Object"}, new String[]{"<d:1.467>", "<sample:8>", "<s:/b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "endOfInputException", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findClass", new String[]{"java.lang.String"}, new String[]{")1.5e300"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String", "<sample:0>", "<sample:6>", "<b:false>", "Nt a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:0>", "<sample:7>", "<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addBeanProps", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "<sample:3>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=true, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1843058734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"]...", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getNodeFactory", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: ]... {getLocalizedMessage=]..., getMessage=]..., getOriginalMessage=]..., getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMapp...#241#-1679846322", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:11>", "1010"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:11>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getAttribute", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:0>", "<sample:0>"}}), new String[][]{{"withFilterId", "java.lang.Object", "5"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"integer\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContain...#344#524265823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getOuterClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<null>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getDefaultNullKeySerializer", ""}, {"com.fasterxml.jackson.databind.SerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "from", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.String"}, new String[]{"<sample:4>", "acc"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: acc {getLocalizedMessage=acc, getMessage=acc, getOriginalMessage=acc, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingE...#237#-1905485296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_validateSubType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:13>", "<sample:0>", "<sample:0>", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Coordinated Universal Time, getID=UTC, getRawOffset=0, isDirty...#207#893006384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:6>", "<sample:9>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:0>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:4>", "<sample:12>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:15>", "<sample:9>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.JsonMappingException$Reference"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 0 (through reference chain: java.lang.String[\"a\"]) {getLocalizedMessage=0 (through reference chain: java.lang.String[\"a\"]), getMessage=0 (through r...#397#6725", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_byteOverflow", "int", "-268435457"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "hasKnownClassAnnotations", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findSingleArgConstructor", "java.lang.Class[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findDefaultViews", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"\t", "<s:b>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:9>", "false", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getFilterProvider", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getTimeZone", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_isCompatible", new String[]{"java.lang.Class", "java.lang.Object"}, new String[]{"<sample:4>", "<i:-2147483648>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "from", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.String", "java.lang.Throwable"}, new String[]{"<sample:7>", "1.25s", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 1.25s {getLocalizedMessage=1.25s, getMessage=1.25s, getOriginalMessage=1.25s, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.Json...#245#648336564", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "hasProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findClassDescription", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "buildBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:3>", "<sample:12>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:11>", "<sample:2>", "<null>", "2", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:11>", "<sample:5>", "<sample:14>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:6>", "<i:-10>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "includeFilterInstance", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_reportFailedNullCoerce", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean", "java.lang.Enum", "java.lang.String"}, new String[]{"<sample:4>", "true", "<sample:2>", "TJTLEE1e10"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:11>", "-11F-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "flushCachedSerializers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String", "<sample:1>", "<sample:15>", "<i:-10>", "Si"}, {"com.fasterxml.jackson.databind.DeserializationContext", "handleUnknownTypeId", "com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String", "<sample:12>", "\n#%s\"00", "<sample:7>", "-22147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasContentType=false, hasGeneri...#435#1283031983", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "isLocalType", new String[]{"java.lang.Class", "boolean"}, new String[]{"<sample:6>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:4>", "<sample:8>", "<sample:8>", "<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdKeyException", new String[]{"java.lang.Class", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "{\"a\":1}2.5e30", " of constnructor "}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "_desc", "java.lang.String", "PT1H1000"}, {"com.fasterxml.jackson.databind.DatabindContext", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:2>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize Map key of type `java.lang.String[]` from String \"{\"a\":1}2.5e30\":  of constnructor \n at [Source: (StringReader); line: 1, ...#568#-1385761119", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructAnySetter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:13>", "<sample:6>", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"[N/A]]...d to# +1"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=[N/A]]...d to# +1, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, ...#269#-1358916912", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "setViews", "java.lang.Class[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true...#255#-1965731076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}}), new String[][]{{"getParameterSource", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:9>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#334#881158522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "returnObjectBuffer", new String[]{"com.fasterxml.jackson.databind.util.ObjectBuffer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportInputMismatch", "com.fasterxml.jackson.databind.JsonDeserializer,java.lang.String,java.lang.Object[]", "<sample:0>", "itle1.5e300", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_dateFormat", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_weirdKey", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Exception", "<sample:9>", "Hello, WorlB1E-5", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportWrongTokenException", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonToken", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:5>", "<sample:5>", "<a>b<a?", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "_isCompatible", "java.lang.Class,java.lang.Object", "<sample:0>", "<i:-40>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:8>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_colonConcat", new String[]{"java.lang.String", "java.lang.String"}, new String[]{")1.5e300", "Not b subtype123456W89012345678901234567890 to "}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "hasSomeOfFeatures", "int", "998"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(")1.5e300: Not b subtype123456W89012345678901234567890 to ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"268435480", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "findPrimaryPropertySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<d:6.0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getDeclaringClass", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:11>", "50"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("50.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<null>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "from", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Throwable"}, new String[]{"<sample:2>", "Hxelio, Wrld", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Hxelio, Wrld {getLocalizedMessage=Hxelio, Wrld, getMessage=Hxelio, Wrld, getOriginalMessage=Hxelio, Wrld, getPathReference=, getStackTrace=[com.fas...#273#1682253780", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_truncate", "java.lang.String", "javaa.jav`.util.Deque500"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "java.lang.String"}, new String[]{"<sample:8>", "<sample:3>", "-5"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "parseDate", "java.lang.String", "Hello, WorldArgument #"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "resolveSubType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:10>", "-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getValueClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Not a subtzpe"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "Argument #", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "11235567"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_byteOverflow", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11235567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "clearLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.JsonMappingException", "prependPath", "com.fasterxml.jackson.databind.JsonMappingException$Reference", "<sample:0>"}, {"com.fasterxml.jackson.databind.JsonMappingException", "getLocalizedMessage", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: sample (through reference chain: UNKNOWN[?]) {getLocalizedMessage=sample (through reference chain: UNKNOWN[?]), getMessage=sample (through referenc...#373#-378048216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getDeclaringClass", new String[]{"java.lang.Class"}, new String[]{"<sample:11>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getConfig", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<i:41>", "<sample:15>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<i:-41>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "defaultSerializeDateValue", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "findSuperTypes", new String[]{"java.lang.Class", "java.lang.Class", "java.util.List"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "visibleInView", "java.lang.Class", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:1>", "<sample:3>"}}), new String[][]{{"isPrimitive", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findBackReferenceProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getIgnoredPropertyNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "set", new String[]{"java.lang.Object", "java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<s:>", "<s:`>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "hasValueDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:13>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:8>", "<s:a>", "-21]7493648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportMissingContent", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"a -", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JsonDeserializer,java.lang.Object,java.lang.String", "<sample:5>", "<sample:18>", "<d:-7.5>", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "findPrimaryPropertySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"[N/8A]"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_isIntNumber", "java.lang.String", "010 of constructor "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", "java.lang.Exception,java.lang.String,java.lang.Object", "<sample:3>", " of constnructor ", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructAnySetter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:1>", "<sample:6>", "<sample:9>", "<sample:4>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleWeirdNumberValue", "java.lang.Class,java.lang.Number,java.lang.String,java.lang.Object[]", "<empty>", "<i:-1>", "/a//b2", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:7>", "<s:ky>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "findAliases", "com.fasterxml.jackson.databind.cfg.MapperConfig", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitAnyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:16>", "<sample:5>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructSettableProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:16>", "<sample:7>", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:14>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<s:Akeyy_>", "<sample:6>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 1), new String[][]{{"handledType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-80>", "<s:\n_b>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getLocale", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<s:u>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:9>", "<sample:3>", "<sample:7>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:9>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"Aguimens #02000a"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", " of canssructor ", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findOptionalStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:10>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:9>", "<sample:13>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "findSuperTypes", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:13>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:11>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "nonNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-120>", "<i:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-120", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<sample:5>", "<sample:14>", "<sample:3>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withDeserializerModifier", new String[]{"com.fasterxml.jackson.databind.deser.BeanDeserializerModifier"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_validateSubType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:15>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:5>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "long"}, new String[]{"<sample:19>", "1001"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromBoolean", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "cachedSerializersCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getEmptyValue", ""}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:15>", "-21]7493N6481.5f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:9>"}}), new String[][]{{"getNullAccessPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:6>", "<b:true>", "<sample:8>", "<sample:3>", "<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultNullKeySerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:4>", "<sample:11>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "21.6f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#297#417376904", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "getDeclaringClass", ""}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#256#-1461936970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:8>", "<d:-6.0>", "r0/7"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "readResolve", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:15>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:3>", "<sample:4>", "<d:0.75>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:7>", "<sample:5>", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:18>", "<d:-1.503>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=true, i...#251#2136809006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:2>", "<sample:13>", "<sample:6>", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructBeanDeserializerBuilder", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:1>"}}), new String[][]{{"getObjectIdReader", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String,java.lang.Throwable", "<sample:3>", "java/util.Deque1.25", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:2>", "<sample:0>"}}), new String[][]{{"properties", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<null>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_isPosInf", "java.lang.String", "21"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "addProperty", new String[]{"com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getFactoryMethods", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:2>", "<sample:2>", "<null>", "<sample:7>", "<sample:8>"}, false, 6, new String[][]{}, 1), new String[][]{{"getValueType", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:13>", "<sample:9>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:8>", "<sample:15>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "isConcrete", new String[]{"java.lang.Class"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "findRawSuperTypes", new String[]{"java.lang.Class", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "false"}, true, 0, null, 1), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromBoolean", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:14>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getOuterClass", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "defaultValue", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>", "<sample:5>", "<sample:15>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findAnySetterAccessor", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "isFactoryMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:10>", "<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "reportMappingProblem", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:0>", "1", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addBackReferenceProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"}, new String[]{"<sample:9>", "<sample:13>", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "instantiateBean", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findSingleArgConstructor", "java.lang.Class[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:12>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:5>", "<i:-5>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"array\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1883172651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "nullOrToString", new String[]{"java.lang.Object"}, new String[]{"<s:Wkkfy>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Wkkfy", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", ":::"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:12>", "-0..0N/A", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "mappingException", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1988385727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "isCollectionMapOrArray", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:15>", "2/20-01-01-214748%648", "sm"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "wrongTokenException", "com.fasterxml.jackson.core.JsonParser,java.lang.Class,com.fasterxml.jackson.core.JsonToken,java.lang.String", "<sample:3>", "<sample:0>", "<sample:5>", "Tite\"%s\""}, {"com.fasterxml.jackson.databind.DatabindContext", "constructType", "java.lang.reflect.Type", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Could not resolve type id '2/20-01-01-214748%648' into a subtype of [reference type, class generated.algorithm.SearchInputFactory_scaffoldi...#669#-809725179", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findPOJOBuilderConfig", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findMethod", "java.lang.String,java.lang.Class[]", "2147484647", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=true, isNonStaticInnerClass=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_colonConcat", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" of constnructor ", " of c\"anssructor "}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:15>", "<sample:11>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" of constnructor :  of c\"anssructor ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>", "<b:true>", "<sample:1>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "-2013265982", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-12"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_isNaN", "java.lang.String", "\u00e9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "quotedOr", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<s:>", "a c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Throwable"}, new String[]{"<sample:6>", "", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<i:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "wrongTokenException", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonToken,java.lang.String", "<sample:2>", "<sample:7>", "{\"a\":1}2.5e30"}, {"com.fasterxml.jackson.databind.DeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<sample:11>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_isIntNumber", "java.lang.String", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:19>", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_findCreatorPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findJsonValueAccessor", ""}, {"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findInjectables", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<i:-294>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:10>", "499.99999999999994"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#329#-1747445055", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "from", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:10>", "/a//b2u"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: /a//b2u {getLocalizedMessage=/a//b2u, getMessage=/a//b2u, getOriginalMessage=/a//b2u, getPathReference=, getStackTrace=[com.fasterxml.jackson.datab...#253#-1728777676", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportWrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "<sample:5>", " nf c", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "setAttribute", "java.lang.Object,java.lang.Object", "<s:t>", "<s:\n+b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:13>", "<sample:0>", "5.", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:11>", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Throwable", "<sample:8>", "Agumfnt #01.5e300", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_isEmptyOrTextualNull", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-1039", "<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:11>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:6>", "<sample:8>", "<sample:2>", "<sample:3>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:6>", "<sample:13>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:13>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "hasSerializationFeatures", "int", "4"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "includeFilterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.Class"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:12>", "<sample:13>", "<sample:5>", "<sample:13>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:11>", "<sample:13>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:7>", "<sample:8>", "<sample:4>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureIncompleteParameter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:14>", "<sample:13>", "<sample:6>", "<sample:2>", "<sample:12>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:5>", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#330#1094852952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:21>", "<sample:9>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "leaseObjectBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "constructType", "java.lang.Class", "<null>"}}), new String[][]{{"initialCapacity", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "includeFilterSuppressNulls", "java.lang.Object", "<s:u>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "false", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<i:34>", "<sample:7>", "<sample:3>"}}), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getActiveView", ""}, {"com.fasterxml.jackson.databind.SerializerProvider", "getSerializationView", ""}}, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:14>", "<null>", "Amgument #", "<sample:0>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleUnexpectedToken", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken", "com.fasterxml.jackson.core.JsonParser", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "<sample:4>", "<sample:3>", "TJTLE1f10", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "weirdKeyException", "java.lang.Class,java.lang.String,java.lang.String", "<sample:1>", "x1s23456889", "0x123456.789"}, {"com.fasterxml.jackson.databind.DeserializationContext", "findNonContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:12>", "<sample:12>", "<null>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withDeserializerModifier", "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "readPropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:13>", "<sample:11>"}}), new String[][]{{"findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "4"}, {"findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:5>", "<sample:9>", "0x1G", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "_desc", "java.lang.String", "-2147483648"}, {"com.fasterxml.jackson.databind.DeserializationContext", "getBase64Variant", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportBadMerge", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:10>", "<sample:10>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseBytePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:12>"}}, 1), new String[][]{{"getSchemaNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"integer\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#63199994", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "r0/71.5f"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:14>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:16>", "[N/A]"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseBooleanFromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:15>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "0#5", "<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultNullValueSerializer", ""}}), new String[][]{{"clearLocation", "", "0"}, {"getSuppressed", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:10>", "<sample:13>", "<sample:1>", "<sample:6>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:15>", "<sample:18>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitAnyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:12>", "<sample:13>", "<sample:1>", "<sample:2>"}}, 1), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"501"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:5>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "filterBeanProps", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "java.util.List", "java.util.Set"}, new String[]{"<sample:2>", "<sample:9>", "<sample:9>", "<sample:3>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:3>", "<i:-2147483648>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "getContextAnnotation", "java.lang.Class", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getNodeFactory", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<b:false>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportBadDefinition", "java.lang.Class,java.lang.String", "<sample:5>", "acc0.75"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.annotation.JsonInclude$Value"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "instantiateBean", "boolean", "false"}, {"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_findPropertyFields", "java.util.Collection,boolean", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=ALWAYS,content=ALWAYS,valueFilter=int.class,contentFilter=int.class) {getContentInclusion=ALWAYS, getValueInclusion=ALWAYS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:7>", "<i:-1024>", "<sample:15>", "<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleWeirdNativeValue", "com.fasterxml.jackson.databind.JavaType,java.lang.Object,com.fasterxml.jackson.core.JsonParser", "<sample:8>", "<i:2147483647>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:15>", "/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:20>", "<sample:1>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getEmptyAccessPattern", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findAnyGetter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getBeanClass", ""}, {"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "resolveType", "java.lang.reflect.Type", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:-41>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportUnresolvedObjectId", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader,java.lang.Object", "<sample:5>", "<s:lb>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "handleUnknownTypeId", "com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String", "<sample:2>", "", "<sample:5>", "1000Not a subtype"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:9>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_isCompatible", new String[]{"java.lang.Class", "java.lang.Object"}, new String[]{"<sample:7>", "<s:gu>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleUnknownTypeId", "com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String", "<sample:4>", "tqte", "<sample:7>", "--11E-5java."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:14>", "true", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#-198467282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_quotedString", new String[]{"java.lang.String"}, new String[]{"1110"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1110\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addInjectables", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"}, new String[]{"<sample:16>", "<sample:7>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"Agumennt #0", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getTypeFactory", ""}}, 3), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "6"}, {"prependPath", "java.lang.Object,int", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Agumennt #0 (through reference chain: java.lang.String[4]->java.lang.String[\"sample\"]) {getLocalizedMessage=Agumennt #0 (through reference chain: j...#493#1856028628", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map", "<sample:13>", "<sample:7>", "<sample:1>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportMappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"Agulennt #0", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<i:-41>", "Arguet #", "<sample:5>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportUnresolvedObjectId", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader,java.lang.Object", "<sample:2>", "<i:41>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:5>", "<sample:4>", "<sample:4>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:18>", "<sample:3>", "<sample:13>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:4>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:7>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"java.util.NbvigacleSet)"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_reportFailedNullCoerce", "com.fasterxml.jackson.databind.DeserializationContext,boolean,java.lang.Enum,java.lang.String", "<sample:12>", "false", "<empty>", "1e1\r0Unsuitable method (1L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<i:2147483647>", "<null>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "mappingException", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<null>", "I", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<null>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coercedTypeDesc", ""}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_isIntNumber", "java.lang.String", "Not c subtype"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<i:41>", "-2147483648"}, true), new String[][]{{"printStackTrace", "java.io.PrintWriter", "4"}, {"getLocalizedMessage", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(was java.lang.Throwable) (through reference chain: java.lang.Integer[?])", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportWrongTokenException", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonToken", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:17>", "<sample:8>", "#22", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "_colonConcat", "java.lang.String,java.lang.String", "=\u00e9(", "-\"\":1}"}, {"com.fasterxml.jackson.databind.DatabindContext", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:4>", "a yc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:8>", "<sample:1>", "<sample:17>", "<sample:1>", "<sample:4>", "<sample:3>"}}), new String[][]{{"getMessage", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Instantiation of $0 value failed: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#296#1476542942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", new String[]{"java.lang.Throwable"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"getProcessor", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#302#-2142709686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:5>", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:6>", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<i:4>", "-ss1.5", "<sample:2>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "findInjectableValue", "java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object", "<s:Wlkfy>", "<sample:4>", "<s:\n+b>"}}, 1), new String[][]{{"constructMapLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class java.lang.Object, contains $0] -> [map-like type; class java.lang.Object, $0 -> $0]] {getEr...#703#1135347540", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:4>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "true", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.SimpleObjectIdResolver", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:10>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:11>", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_intOverflow", "long", "2251799813685261"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:16>", "<>b</a->"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "double"}, new String[]{"<sample:4>", "502.9"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getActiveView", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_colonConcat", "java.lang.String,java.lang.String", " of canstructor ", "25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "primitiveType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:19>", "0X010"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "(was ", "<sample:22>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:23>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:1>", "<sample:1>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "hasGetterSignature", new String[]{"java.lang.reflect.Method"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportTrailingTokens", "java.lang.Class,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonToken", "<sample:0>", "<sample:1>", "<sample:6>"}}, 1), new String[][]{{"getIntBuilder", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$IntBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:16>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "java.lang.String"}, new String[]{"<sample:7>", "123456789012345678901234667890\"%s\"", "<null>", "507"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "canOverrideAccessModifiers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "resolveSubType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:3>", ":"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getConfig", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:5>", "<null>", "<sample:2>", "<sample:9>", "<sample:9>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
