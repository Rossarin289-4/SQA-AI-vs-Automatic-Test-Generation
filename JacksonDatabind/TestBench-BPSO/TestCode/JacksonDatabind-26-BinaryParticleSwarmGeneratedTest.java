package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:b>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}), new String[][]{{"serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}}), new String[][]{{"wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "0"}, {"getViews", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:1>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<i:-2048>", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<d:1.79>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}, {"getContextAnnotation", "java.lang.Class", "0"}, {"annotationType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:rkex>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<d:-7.5>", "<s:keey>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getNam...#333#-1726693735", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<d:10.300000000000002>", "<sample:0>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:jey>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<d:4.73>", "<s:ky>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<i:-512>", "<sample:2>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<d:2.33>", "<s:rkey>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:jiy>", "<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:a>", "<s:ky.>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 3), new String[][]{{"findAnnotation", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#-2000552232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<i:0>", "<sample:1>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:7>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:Wey>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 1), new String[][]{{"annotationType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<d:-61.38>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<empty>", "<sample:10>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getAnnotation", "java.lang.Class", "2"}, {"isUnwrapping", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:k1\te6>", "<sample:9>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 1), new String[][]{{"removeInternalSetting", "java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer", actual.getClass().getName());
  assertEquals("{getPropertyName=null, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:9rkey>", "<sample:4>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:5.450000000000001>", "<sample:5>", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<s:rkey>", "<sample:5>", "<sample:8>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:rkey>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:k>", "<s:>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#593#588418037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-62>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}}, 3), new String[][]{{"unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=true, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 2), new String[][]{{"getInternalSetting", "java.lang.Object", "0"}, {"setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 1), new String[][]{{"annotationType", "", "4"}, {"annotationType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:rk>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"hasSimpleName", "java.lang.String", "0"}, {"getSimpleName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:k\nee6d>", "<d:-0.75>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:keH>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<null>", "<sample:0>"}}, 2), new String[][]{{"getSerializationType", "", "6"}, {"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:2>", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#304#-1154787086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:k\ney>", "<sample:6>", "<sample:2>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<d:1.62>", "<sample:6>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=<a><b>t</b></a>, getViews=null, hasNullSerializer=false, hasSeria...#266#-295946862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:10>", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.0300000000000002>", "<sample:7>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<i:-8388606>", "<sample:4>", "<sample:0>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:k\ne6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'aa' (virtual, no static serializer) {getName=aa, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:0.75>", "<sample:6>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=true, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:6>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:k\ney>", "<s:b>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<sample:0>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, no static serializer) {getName=, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:ey>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:kuy>", "<d:-3.95>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isEmpty", "", "6"}, {"getNamespace", "", "5"}, {"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:5>", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false), new String[][]{{"getMember", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:0>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "1"}, {"setInternalSetting", "java.lang.Object,java.lang.Object", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:6>", "<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.15>", "<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<b:true>", "<d:0.81>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#593#588418037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:>", "<sample:10>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false), new String[][]{{"isUnwrapping", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0a' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName=0a, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPo...#252#342839580", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<null>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:7>", "<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ldy>", "<s:a>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "5"}, {"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}), new String[][]{{"hasSerializer", "", "3"}, {"unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getNam...#332#-909284244", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false), new String[][]{{"depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:rkey>", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer...#277#1272597336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#304#-1394567564", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals(" {getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"getMetadata", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:1>", "<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:2.05>", "<d:-0.75>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals(" {getNamespace=null, getSimpleName=, hasNamespace=false, hasSimpleName=false, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:1>", "<sample:7>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.FailingSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#735353829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}), new String[][]{{"annotationType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getSimpleName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:4>", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericS...#667#-278115368", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:l\ney>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}), new String[][]{{"writeTypePrefixForObject", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,java.lang.Class", "5"}, {"writeCustomTypePrefixForObject", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer", actual.getClass().getName());
  assertEquals("{getPropertyName=null, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}), new String[][]{{"annotationType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"handledType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:k\ney<>", "<s:by>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:7>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"hasSimpleName", "java.lang.String", "5"}, {"getNamespace", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getSimpleName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer", actual.getClass().getName());
  assertEquals("{getPropertyName=null, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:11>"}, false), new String[][]{{"hasNullSerializer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}), new String[][]{{"setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:9>"}}), new String[][]{{"setInternalSetting", "java.lang.Object,java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#-130907592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}), new String[][]{{"appendQuotedUTF8", "byte[],int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<i:-1>", "<sample:4>", "<sample:2>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<sample:4>"}}), new String[][]{{"writeQuotedUTF8", "java.io.OutputStream", "6"}, {"appendQuotedUTF8", "byte[],int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (virtual, no static serializer) {getName=<a><b>t</b></a>, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, ...#216#31259661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}), new String[][]{{"serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}, {"getMember", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:8>", "<s:rkey>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:0>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:7>", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<s:>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:0.075>", "<s:key>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>"}}), new String[][]{{"appendQuoted", "char[],int", "7"}, {"appendUnquotedUTF8", "byte[],int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:0.15>", "<sample:2>", "<sample:4>"}}), new String[][]{{"getSerializedName", "", "1"}, {"charLength", "", "4"}, {"putUnquotedUTF8", "java.nio.ByteBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getErasedSignature", "", "6"}, {"widenContentsBy", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:6>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer...#277#1272597336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:0.15>", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"containedType", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.FailingSerializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#-1689968827", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}), new String[][]{{"appendUnquotedUTF8", "byte[],int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=true, hasSerializer=true, isRequired=false, i...#235#926723185", SearchInputFactory_scaffolding.receiverState());
 }
}
