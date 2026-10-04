package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:5>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>", "<i:1>", "<null>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:8>", "<s:>V>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<null>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "9223372036854775807", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:}}QQ>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}}QQ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasContentType=false, hasGeneri...#435#1283031983", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "2080374783"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<null>"}}, 3), new String[][]{{"getContentTypeHandler", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<i:-131080>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:3>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<s:b>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<s:b>", "<sample:1>"}}, 3), new String[][]{{"isUnwrappingSerializer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<s:key>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}}, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<s:key>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}}, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:1>", "<a>b</a>", "<sample:0>"}}, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:6>", "<s:H#KX>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<empty>", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<null>", "<s:H#Xe>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:0>", "<s:2#L1e>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<null>", "<b:false>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:0>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"-1", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: -1 {getLocalizedMessage=-1, getMessage=-1, getOriginalMessage=-1, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingExcep...#233#-674825836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:4>"}}, 1), new String[][]{{"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.nio.file.Path {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.nio.file.Path, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], get...#623#1277205260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.nio.file.Path {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.nio.file.Path, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], get...#623#1277205260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"0x123456789", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:0>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:11>", "<i:-1073741865>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "true", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:7>", "<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:8>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:0>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<empty>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<s:b>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "true", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<s:a>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>", "<sample:5>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<null>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:2>", "[1,2]", "<sample:3>"}}, 1), new String[][]{{"toPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("HH:mm:ss", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<null>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<i:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "false", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "1", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:8>", "<sample:10>"}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 1), new String[][]{{"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_EMPTY,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_EMPTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>", "<s:a>", "<sample:0>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:8>", "H", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "long,com.fasterxml.jackson.core.JsonGenerator", "1099503239170", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:3>"}}, 3), new String[][]{{"hasHandlers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "-1", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", "java.lang.Object,java.lang.Object", "<s:key>", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:6>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<s:/a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "3"}, {"hasGenericTypes", "", "3"}, {"getReferencedType", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:5>", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<i:-1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "-1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[recursive type; UNRESOLVED>] {getErasedSignature=Lge...#641#1530707382", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<empty>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "false", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<a>b</a>", "<s:b>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"Tiit.l", "<s:>", "<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-1", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:0>"}, false), new String[][]{{"getDelegatee", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:7>"}, false), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:2>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<empty>", "1.5e300", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:7>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:4>"}}), new String[][]{{"isEmpty", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "{\"a\":1}", "<s:b>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "false", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<i:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<s:b>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:6>", "<d:1.5>", "<sample:3>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:1>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1073741865>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "2"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", "com.fasterxml.jackson.databind.BeanDescription,java.lang.String,java.lang.Object[]", "<sample:2>", "Title", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "0x1F", "<i:0>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<s:>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:11>", "<i:-1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:11>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>", "<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:5>", "<s:>V>", "<sample:1>", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "2147483647"}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<i:0>", "<sample:6>"}}), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "false", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.text.SimpleDateFormat", actual.getClass().getName());
  assertEquals("{isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:2>", "[1,2]", "<sample:3>"}}), new String[][]{{"toPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h:mm:ss a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:0>", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<null>", "<null>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:0>", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<i:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}), new String[][]{{"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_EMPTY,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_EMPTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "I", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "1.25", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "1.25", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:2>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "3"}, {"hasGenericTypes", "", "3"}, {"getReferencedType", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<null>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<d:1.5>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"java.lang.Class", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "false", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"java.lang.Class", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "false", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "TITLE", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<s:key>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<s:key>", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "2", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "112", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "112", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "-9223372036854775808", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("[SerializationConfig: flags=0x2989bc] {canOverrideAccessModifiers=true, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, should...#235#-1028316316", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:2>", "<s:a>", "<null>", "<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<null>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", "java.lang.Object,java.lang.Object", "<s:a>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", "java.lang.Object", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<i:-1>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:11>", "<s:>", "<sample:2>", "<sample:4>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<null>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<i:-1>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<b:false>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<i:-2147483648>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<b:false>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<i:-2147483648>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:a>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<i:-2147483648>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:a>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<i:0>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", new String[]{"java.lang.String", "java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"+1", "<i:0>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<empty>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<i:-2147483648>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<b:true>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<empty>", "1.1234567", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<null>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "<sample:7>", "0xFFFFFFFF", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "1e10", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "true", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 1e10 {getLocalizedMessage=1e10, getMessage=1e10, getOriginalMessage=1e10, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMapp...#241#-1330902510", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:-8388607>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-8388607", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:-4194303>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-4194303", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<i:-4194303>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-4194303", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:a>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<s:>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:a>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<s:>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:8>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-47>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<i:-2>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:1>", "<sample:6>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"010", "<null>"}, false), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"i", "<null>"}, false, 12, new String[][]{}), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"j", "<null>"}, false, 12, new String[][]{}), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"k", "<null>"}, false, 12, new String[][]{}), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1e10", "<sample:0>"}, false, 12, new String[][]{}), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1", "<sample:0>"}, false, 12, new String[][]{}), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1", "<sample:2>"}, false, 11, new String[][]{}), new String[][]{{"getOriginalMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"--1", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:11>", "<s:a>", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:11>", "<s:a>", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"findSerializationSortAlphabetically", "com.fasterxml.jackson.databind.introspect.Annotated", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:11>", "<s:a>", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 15, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:4>", "WA", "<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "Title", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:a>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample__a {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample (a), getDisplayScript=, getDisplayVariant=a, getISO3Country=, getISO3Language=!MissingResourceException, ge...#264#2001601015", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:6>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", "com.fasterxml.jackson.databind.BeanDescription,java.lang.String,java.lang.Object[]", "<sample:0>", "1e10", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-42", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"32", "<sample:6>"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:0>", "0x1F", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 0x1F {getLocalizedMessage=0x1F, getMessage=0x1F, getOriginalMessage=0x1F, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMapp...#241#-1372070938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:4>", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "long,com.fasterxml.jackson.core.JsonGenerator", "2", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "i1.5", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "true", "<null>"}}), new String[][]{{"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "true", "<null>"}}), new String[][]{{"usesObjectId", "", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<null>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-9223372036854775808", "<sample:2>"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "1.25", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "1.5f", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>", "<i:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:0>", "<d:1.5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<s:a>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<i:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
