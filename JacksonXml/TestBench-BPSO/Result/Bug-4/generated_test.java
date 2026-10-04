package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:6>", "<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:6>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:1>", "<s:d>"}}, 1), new String[][]{{"findValueSerializer", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:8>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<s:9m;>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<null>", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<s:m>", "<sample:10>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"mull", "<i:0>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:0>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "0x1F", "<i:-1>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.SimpleObjectIdResolver", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "<sample:4>", "TTitle", "<sample:1>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "false", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:0>", "<s:ddkey>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "", "<sample:2>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:9>", "<s:b>", "<sample:3>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<b:false>", "<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"[1,2]", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:2>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: [1,2] {getLocalizedMessage=[1,2], getMessage=[1,2], getOriginalMessage=[1,2], getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.Json...#245#-1037722864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<s:n>", "<sample:1>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:6>", "<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<empty>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:1>", "aaaaaaaabaaaaaaaaaaaaaaaaaaaaa--1", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'a'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:5>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:2>"}}, 3), new String[][]{{"isUnwrappingSerializer", "", "5"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:3>", "<s:m>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "<sample:0>", "\t", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", "java.lang.Object", "<s:dje>>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'15.0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<i:-13>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'-13'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<i:2>", "<sample:0>", "<sample:5>", "<null>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "+1TITLE", "<s:cey>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:2>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<s:dj_d>>", "<sample:6>"}, false, 1, new String[][]{}, 3), new String[][]{{"writeAsId", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<null>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<s:9c>", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "false", "<sample:6>"}}, 3), new String[][]{{"isEmpty", "java.lang.Object", "3"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "long,com.fasterxml.jackson.core.JsonGenerator", "-2199023255554", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"dE-5", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", ""}}, 3), new String[][]{{"getProcessor", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"1", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:7>", "<s:b>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:;dey>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("';dey'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<d:17.5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'17.5'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.Object", "<s:m;>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<b:true>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"ltem", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: ltem {getLocalizedMessage=ltem, getMessage=ltem, getOriginalMessage=ltem, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMapp...#241#216159852", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:3>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", "com.fasterxml.jackson.databind.BeanDescription,java.lang.String,java.lang.Object[]", "<sample:1>", "\u00e8", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "true", "<sample:8>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<empty>", "_", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: _ {getLocalizedMessage=_, getMessage=_, getOriginalMessage=_, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingException...#229#-1075238196", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "2"}, {"handledType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<sample:3>", "<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:3>", "<i:-16>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:6>", "<sample:1>", "0xFFFFFFFFHello, World", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:5>", "<sample:0>", "214748g3648a", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:dkey>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "PT1H", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:4>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<s:dje>>", "<sample:4>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<empty>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "long,com.fasterxml.jackson.core.JsonGenerator", "-2", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"1", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "true", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:2>", "<s:m>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:5>", "<sample:6>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:4>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"java.lang.Class", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "true", "<sample:6>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:2>", "<sample:4>"}}), new String[][]{{"isEmpty", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:-28>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<s:m>", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-28", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:m;>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'m;'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'3.0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:9>", "<sample:6>"}, false), new String[][]{{"defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:3>", "<s: dje>>", "<sample:10>", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "0xFFFFFFFFTITLE", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "false", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"<a>b=/a>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<null>"}}), new String[][]{{"fillInStackTrace", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: <a>b=/a> {getLocalizedMessage=<a>b=/a>, getMessage=<a>b=/a>, getOriginalMessage=<a>b=/a>, getPathReference=, getStackTrace=[java.base/jdk.internal....#257#273360520", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"11", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<s:m>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<s:da>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<null>", "<s:m;>", "<sample:1>", "<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:keys>", "<s:aa>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<s:pb>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.SimpleObjectIdResolver", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "9223372036854775807", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:3>"}, false, 3, new String[][]{}), new String[][]{{"usesObjectId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", "com.fasterxml.jackson.databind.BeanDescription,java.lang.String,java.lang.Object[]", "<sample:4>", "1.2\"5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:0>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<s:key>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<s:m/>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}), new String[][]{{"writeAsField", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"1.6", "<s:mC;>", "<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>", "<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("''", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", ""}}), new String[][]{{"isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "1"}, {"findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:5>", "<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "2"}, {"isUnwrappingSerializer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:m;->"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'m;-'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:m>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<s:c>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'m'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "2020-02-30T25:61::61", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:m=>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<s:dk_ey>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'m='", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<null>", "<s:m;>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:dje>>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'dje>'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:3>", "<s:mm;>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:7>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.Object", "<s:dj{>>>"}}), new String[][]{{"objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.Object", "<s:m>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"UITLE", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"properties", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'key'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#595#-1823180577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "a b", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'ky'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}}), new String[][]{{"usesObjectId", "", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}), new String[][]{{"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<b:true>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "nnull\u00e9", "<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"i ", "<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"getLocation", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:1>", "", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:2>"}}, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"[1,b2]", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}, 3), new String[][]{{"fillInStackTrace", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: [1,b2] {getLocalizedMessage=[1,b2], getMessage=[1,b2], getOriginalMessage=[1,b2], getPathReference=, getStackTrace=[java.base/jdk.internal.reflect....#249#-489213978", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "-2147483648"}}, 3), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:bB>", "<s:d_ey>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<null>", "<i:0>", "<sample:3>", "<null>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false), new String[][]{{"isUnwrappingSerializer", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"null\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#-1508571366", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<i:-8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:1>", "2.5", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", ""}}), new String[][]{{"getStackTrace", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.StackTraceElement;", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:291), com.fasterxml.jackson.databind.SerializerProvider.mappingException(SerializerProvider.java:1124), java.base/jd...#962#-71257545", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-6", "<s:b>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"keySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:7>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}}, 1), new String[][]{{"serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"parse", "java.lang.String,java.text.ParsePosition", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:dj;e>>", "<d:1.5>"}, false, 7, new String[][]{}), new String[][]{{"findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:8>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:3>", "<s:d\nje>>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:3>"}}, 2), new String[][]{{"getSerializationView", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "1L", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<null>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:8>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<i:1>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "12345678901234567890123456780", "<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-114", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<s:djey>", "<null>", "<sample:2>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"a,b,\t0x1F", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<i:32>", "<sample:4>", "<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{}), new String[][]{{"getTypeFactory", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:10>", "<s:m<>", "<sample:1>", "<sample:3>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:7>", "<sample:5>"}, false, 1, new String[][]{}), new String[][]{{"mappingException", "java.lang.String,java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: a {getLocalizedMessage=a, getMessage=a, getOriginalMessage=a, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingException...#229#-1089560304", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false), new String[][]{{"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "123456789012345678901234567890123456789012345678901234567890", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<s:mA>"}}, 1), new String[][]{{"printStackTrace", "java.io.PrintStream", "7"}, {"addSuppressed", "java.lang.Throwable", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 123456789012345678901234567890123456789012345678901234567890 {getLocalizedMessage=123456789012345678901234567890123456789012345678901234567890, get...#487#1746556639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"format", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<s:>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:3>", "<s:7;>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2020-01-011.12345678901234567", "<sample:1>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:5>", "<s:djeA>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", "java.lang.Object,java.lang.Object", "<i:0>", "<s:dkey>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<null>", "TITLEm", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:k9_y>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k9_y", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:1>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:3>"}}, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"containsValue", "java.lang.Object", "5"}, {"containsValue", "java.lang.Object", "5"}, {"remove", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-9223372036854775808", "<sample:6>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:Xa>", "<null>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:6>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<s:n>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:4>", "<s:b>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", ""}}), new String[][]{{"handledType", "", "7"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"null\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1823830347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:3>", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<null>", "<s:d>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
