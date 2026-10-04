package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:7>", "<i:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<s:bkey>", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception", "<sample:5>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<null>", "<sample:0>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<empty>", "C5.", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1.1234567890123456\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "true", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-67108863>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"i\n"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"i\n\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:2>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>", "<s:b\reDy>", "<sample:7>", "<sample:0>", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "3"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<empty>", "0xFF3FFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "PT91/", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:3>"}}, 2), new String[][]{{"clearLocation", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: PT91/ {getLocalizedMessage=PT91/, getMessage=PT91/, getOriginalMessage=PT91/, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.Json...#245#1910705460", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:4>", "<null>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"http://example.comm/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", "java.lang.String", "5o"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.comm/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "resolveSubType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:3>", "0x1G"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:2>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:5>", "<b:false>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<null>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:3>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:3>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<empty>", "<sample:7>"}}, 1), new String[][]{{"reportBadDefinition", "java.lang.Class,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:4>", "<sample:6>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"java.lang.Class", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<empty>", "true", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "false", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"a", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:0>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:4>", "<s:5al>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<i:-2>"}}, 1), new String[][]{{"findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "2"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "true", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:1>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"23"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "java.lang.Class,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "true", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:1>", "11.1234567", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:4>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 11.1234567 {getLocalizedMessage=11.1234567, getMessage=11.1234567, getOriginalMessage=11.1234567, getPathReference=, getStackTrace=[com.fasterxml.j...#265#-1289244968", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullKeySerializer", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "false", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:7>", "<sample:5>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<i:2>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", "java.lang.Object,java.lang.Object", "<sample:1>", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", ".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:6>", "<sample:8>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:3>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"z\"a\":1}"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("z\"a\":1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:5>", "<i:-4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"item"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"item\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:4>"}, false, 3, new String[][]{}, 1), new String[][]{{"getStackTrace", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.StackTraceElement;", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.JsonMappingException.from(JsonMappingException.java:284), com.fasterxml.jackson.databind.SerializerProvider.mappingException(SerializerProvider.java:1251), java.base/jd...#962#-1127790820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<s:bkey>", "<sample:7>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "false", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Throwable", "<sample:1>", " ", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"-0."}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"-0.\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"[1,2]1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"isEmpty", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Exception"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:6>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 0 {getLocalizedMessage=0, getMessage=0, getOriginalMessage=0, getPathReference=, getStackTrace=[com.fasterxml.jackson.dataformat.xml.ser.XmlSeriali...#229#-734263410", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.String", "1."}}, 1), new String[][]{{"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"-1.4", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<sample:6>", "<i:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<d:0.75>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyFormat", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:1>", "Ia", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Ia {getLocalizedMessage=Ia, getMessage=Ia, getOriginalMessage=Ia, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingExcep...#233#1246256188", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<null>", "<sample:1>", "<sample:0>", "<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:2>", "ab", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"1.5d<a>b</a>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d<a>b</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<s:t`>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:6>", "<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:3>", "h"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.SerializationConfig", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true, getDefaultMergeable=null, getRootName=null, getSerializationFeatures=2722236, getSerializationInclusion=ALWAYS, isAnnotationProcessingEnabled=true, shouldSortProperti...#223#-1452044294", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:1>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", "java.lang.String", "L-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getLocale", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:7>", "<sample:0>"}, false), new String[][]{{"getAnnotationIntrospector", "", "2"}, {"findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "\n", "<s:bW>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<i:0>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"L-1", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:3>", "<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:2>", "<sample:3>"}}), new String[][]{{"findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:-1>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Exception", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-9223372036854775807", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadPropertyDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "<sample:6>", "1.24", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getDelegatee", "", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:4>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:23>", "<s:,>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTypeFactory", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", "long,com.fasterxml.jackson.core.JsonGenerator", "8194", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:4>", "<s:`>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getUnknownTypeSerializer", "java.lang.Class", "3"}, {"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"-,1", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>", "<i:-2147483648>", "<null>", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: -,1 {getLocalizedMessage=-,1, getMessage=-,1, getOriginalMessage=-,1, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingE...#237#-1526917358", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasContentType=false, hasGeneri...#435#1283031983", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "12:20", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "invalidTypeIdException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "12:", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException: Could not resolve type id '12:' as a subtype of $0: 1 {getLocalizedMessage=Could not resolve type id '12:' as a subtype of $0: 1, getMessage=...#458#-490251750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", "java.lang.String", "mull"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"0y1F1.25"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0y1F1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getFilterProvider", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:0>", "H"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<i:-1>", "<null>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "1234567890123456789019234567890", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:2>", "t3ue"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "includeFilterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:6>", "<i:-51>"}});
  assertNotNull(actual);
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:1>", "<s:b>"}}), new String[][]{{"converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"a,b,0c"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"a,b,0c\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "includeFilterSuppressNulls", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}), new String[][]{{"reportBadDefinition", "java.lang.Class,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "0x0F", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:0>", "2.12345678", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "resolveSubType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:3>", "[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_colonConcat", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".", "F"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".: F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String", "java.lang.Throwable"}, new String[]{"<null>", "1e60", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "1ee10", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", "java.lang.Object", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}), new String[][]{{"findNullValueSerializer", "com.fasterxml.jackson.databind.BeanProperty", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_asXmlGenerator", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializerFor", new String[]{"java.lang.Class", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:1>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"\u00e9", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "invalidTypeIdException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "+0", ""}, false), new String[][]{{"getLocalizedMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Could not resolve type id '+0' as a subtype of $0: ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:0>", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"handledType", "", "1"}, {"properties", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.SerializationFeature"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Exception"}, new String[]{"<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<s:>", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:7>", "d", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{">", "<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"0x12345678912:30:45", "<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"getLocalizedMessage", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12345678912:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:5>", "<sample:9>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:2>", "<s:.>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:0.75>", "<s:a\t>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "hasSerializationFeatures", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.Throwable"}, new String[]{"<sample:3>", "1.1234557", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:2>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<i:-2147483624>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"java.lang.Class", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "false", "<sample:7>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false), new String[][]{{"handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"9223372036854775807", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.String", "2020.01-01"}}), new String[][]{{"defaultSerializeDateKey", "long,com.fasterxml.jackson.core.JsonGenerator", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "false", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Throwable", "<sample:2>", "i", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_colonConcat", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789+10", "\037\037"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789+10: \037\037", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAnnotationIntrospector", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "invalidTypeIdException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "L-11", "1L1.5e300"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String", "<sample:0>", "[no message for <a>b</a>"}}), new String[][]{{"getCause", "", "3"}, {"getMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Could not resolve type id 'L-11' as a subtype of [collection type; class java.lang.Object, contains $0]: 1L1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", "java.lang.String", "m--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"2020-02-30T25:61:61\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "{\"\":1}", "<empty>"}, false), new String[][]{{"clearLocation", "", "3"}, {"initCause", "java.lang.Throwable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_dateFormat", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.StdDateFormat", actual.getClass().getName());
  assertEquals("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat: (timezone: null, locale: en_US, lenient: null) {isColonIncludedInTimeZone=false, isLenient=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, $0 -> $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0$0>;, getTypeName=[map-like type; class java.lang.Object, $0 -> $0], h...#463#-1745081143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Exception"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "invalidTypeIdException", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String", "<sample:7>", "]", "-1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException:  {getLocalizedMessage=, getMessage=, getOriginalMessage=, getPathReference=, getStackTrace=[com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerP...#225#-1818473076", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:13>", "<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "includeFilterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.Class"}, new String[]{"<sample:7>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1L12:30:45 ", "<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"clearLocation", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 1L12:30:45  {getLocalizedMessage=1L12:30:45 , getMessage=1L12:30:45 , getOriginalMessage=1L12:30:45 , getPathReference=, getStackTrace=[com.fasterx...#269#-1583602066", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"+0", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_rootNameFromConfig", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "cachedSerializersCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String", "<sample:0>", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object"}, new String[]{"<null>", "<s:>>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<null>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"hasGenericTypes", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<null>"}, false), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"defaultSerializeField", "java.lang.String,java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}), new String[][]{{"hasContentType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<null>", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", new String[]{"java.lang.String"}, new String[]{"BH1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"BH1\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findKeySerializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_initWithRootName", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "javax.xml.namespace.QName"}, new String[]{"<sample:2>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "includeFilterSuppressNulls", new String[]{"java.lang.Object"}, new String[]{"<s:bky>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:5>"}, false), new String[][]{{"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}), new String[][]{{"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_colonConcat", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-", "true0xFFFFFFFF"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-: true0xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "invalidTypeIdException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "", " "}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", "java.lang.String,java.lang.Object[]", "1.12345678s01234567", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "<sample:0>", "<sample:9>"}}), new String[][]{{"getLocalizedMessage", "", "6"}, {"getLocation", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"21474836481.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String,java.lang.Throwable", "<sample:3>", "010", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474836481.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "0x123456789", "<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 0x123456789 {getLocalizedMessage=0x123456789, getMessage=0x123456789, getOriginalMessage=0x123456789, getPathReference=, getStackTrace=[com.fasterx...#269#-975789208", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Exception"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"getLocation", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"12:30:451.12345678", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:451.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1.1234567890123456", "<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:5>", "<sample:7>"}}), new String[][]{{"getCause", "", "7"}, {"getLocalizedMessage", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<s:a>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", new String[]{}, new String[]{}, false), new String[][]{{"reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Throwable", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"1M"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1M", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "11234567890123456789012\r4567890", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<null>"}, false), new String[][]{{"isUnwrappingSerializer", "", "6"}, {"isUnwrappingSerializer", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Exception"}, new String[]{"<sample:1>", "<empty>"}, false, 1, new String[][]{}), new String[][]{{"getPathReference", "java.lang.StringBuilder", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"null010"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"[1,2+"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getSerializationView", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "includeFilterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"http://eBxample.com/a?b=c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://eBxample.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "false", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:8>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", "java.lang.String", "123456[789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<s:5>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getGenerator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_colonConcat", "java.lang.String,java.lang.String", "a cb", "1.12345678901234567Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"L-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getUnknownTypeSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}}), new String[][]{{"properties", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:0>", "<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.WritableObjectId", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"n\nll-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_quotedString", "java.lang.String", "08x1r"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n\nll-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:2>", "<sample:0>"}, false, 3, new String[][]{}), new String[][]{{"getDefaultNullKeySerializer", "", "1"}, {"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<empty>", "PU1Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericBase {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:2>"}}), new String[][]{{"findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"]"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getConfig", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{", ", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(", ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "copy", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}), new String[][]{{"serialize", "org.w3c.dom.Node,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}, {"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_truncate", new String[]{"java.lang.String"}, new String[]{"http://example.com/aa?b=c"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/aa?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_desc", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456 "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456 ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_wrapAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Exception"}, new String[]{"<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setNullKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}), new String[][]{{"getMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=NON_ABSENT,content=NON_EMPTY,valueFilter=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf.class,contentFilter=java.lang.Integer.class) {getContentInclusion=NON_EM...#234#1510373932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_findExplicitUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getActiveView", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.SerializerFactory"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "flushCachedSerializers", ""}}), new String[][]{{"findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<null>", "<s:a>", "<sample:3>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:bu>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "false", "<sample:3>"}}), new String[][]{{"canOverrideAccessModifiers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:3>", "12:20", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "1.5f", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "generateJsonSchema", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_format", "java.lang.String,java.lang.Object[]", "0xFFFFFFFFI", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "defaultSerializeDateValue", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_serializeXmlNull", "com.fasterxml.jackson.core.JsonGenerator", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "serializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:0>", "<s:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypedValueSerializer", new String[]{"java.lang.Class", "boolean", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "false", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "createInstance", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.SerializerFactory", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericBase {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<d:-0.75>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_createObjectIdMap", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}), new String[][]{{"get", "java.lang.Object", "6"}, {"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.IdentityHashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findNullValueSerializer", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}), new String[][]{{"usesObjectId", "", "7"}, {"isEmpty", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<empty>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_startRootArray", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator,javax.xml.namespace.QName", "<sample:9>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "getTimeZone", ""}}), new String[][]{{"getDelegatee", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "mappingException", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"i", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:1>", "<i:-55>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "_handleContextualResolvable", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "constructType", "java.lang.reflect.Type", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String,java.lang.Throwable", "<sample:2>", "aaaaaaaaaaaaa_aaaaaaaa`aaaaaaa", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:1>"}, false, 4, new String[][]{}, 2), new String[][]{{"handledType", "", "7"}, {"isEmpty", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
}
