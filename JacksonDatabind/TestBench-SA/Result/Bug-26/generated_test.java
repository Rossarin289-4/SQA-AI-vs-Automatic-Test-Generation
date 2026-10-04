package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:2>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:-130>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:6>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getGenericPropertyType", "", "5"}, {"getActualTypeArguments", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.reflect.Type;", actual.getClass().getName());
  assertEquals("[T]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<i:7>", "<s:key>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<i:2>", "<i:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<null>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<d:1.5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<d:-1.5>", "<i:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 2), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.FailingSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#735353829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:10>", "<sample:0>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:5>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#304#-1154787086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:rUWW>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:@_5>", "<sample:1>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=true, hasSerializer=true, isRequire...#245#-835112766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<sample:1>"}}), new String[][]{{"getWrapperName", "", "1"}, {"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "7"}, {"unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '{\"a\":1}a x \t y ' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.IteratorSerializer) {getName={\"a\":1}a x \t y , getViews=null, hasNullSerializer=false, hasSerializ...#278#-112118572", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:-1>", "<sample:5>", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:rTWB>", "<i:41>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}, 2), new String[][]{{"assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "6"}, {"getMember", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<i:7>", "<s:rUWW>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:rUWW>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}, 2), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (virtual, no static serializer) {getName=<a><b>t</b></a>, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, ...#216#31259661", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, no static serializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2), new String[][]{{"findAnnotation", "java.lang.Class", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}, 2), new String[][]{{"findAnnotation", "java.lang.Class", "6"}, {"depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:0>", "<sample:4>", "<null>", "<sample:0>"}}, 3), new String[][]{{"findAnnotation", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}}, 3), new String[][]{{"getInternalSetting", "java.lang.Object", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}}, 3), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<sample:4>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'sample' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=sample, getV...#310#-2010196906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<null>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<null>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer", "<i:7>", "<null>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, no static serializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#593#588418037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}}, 1), new String[][]{{"isFinal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#594#188503155", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#593#-2007587532", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"getErasedSignature", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"getErasedSignature", "", "7"}, {"getTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getReferencedType", "", "5"}, {"hasGenericTypes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getReferencedType", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"getReferencedType", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"getReferencedType", "", "5"}, {"getParameterSource", "", "7"}, {"getValueHandler", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#299#-1406182175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=true, hasSerializer=true, isRe...#250#117517820", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:3>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:#9z>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:#9z>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:11>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:#9z>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:6>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:4>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:7>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:5>"}}, 2), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 1), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=<a><b>t</b></a>, getViews=null, hasNullSerializer=false, hasSeria...#266#-295946862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:aoa>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:3>"}}, 3), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=nu...#302#918847168", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}), new String[][]{{"findAnnotation", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}), new String[][]{{"serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("a {getNamespace=null, getSimpleName=a, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals(" {getNamespace=null, getSimpleName=, hasNamespace=false, hasSimpleName=false, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"hasNamespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ClassSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:6>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=true, hasSerializer=true, isRe...#250#117517820", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#299#-1406182175", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:>", "<null>", "<sample:7>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:a>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("a {getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<i:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:b>", "<sample:2>", "<null>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=<a><b>t</b></a>, getViews=null, hasNullSerializer=false, hasSeria...#266#-295946862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}}), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}}), new String[][]{{"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequ...#248#1140395078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:b>", "<null>", "<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<d:-0.28500000000000003>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:7>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"getMember", "", "7"}, {"getGenericType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isUnwrapping", ""}}), new String[][]{{"appendQuoted", "char[],int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:jfy>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:3>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "7"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"get", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:b>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:TWB>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:0>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "4"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"getGenericPropertyType", "", "3"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("<a><b>t</b></a> {getValue=<a><b>t</b></a>}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:TWB>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:0>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "4"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"getGenericPropertyType", "", "3"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals(" {getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:TWB>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "4"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"getGenericPropertyType", "", "3"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("a {getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:rTWB>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:7>"}}, 3), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "3"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "4"}, {"getGenericPropertyType", "", "5"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:6>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getGenericPropertyType", "", "5"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("a {getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:-128>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:6>"}}, 1), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getGenericPropertyType", "", "5"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:-107>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:4>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getGenericPropertyType", "", "7"}, {"getSerializedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:107>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:4>"}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}, {"getGenericPropertyType", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:6>"}}, 1), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "6"}, {"getGenericPropertyType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:6>"}}, 2), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}, {"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "6"}, {"getGenericPropertyType", "", "6"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl", actual.getClass().getName());
  assertEquals("java.util.List<T> {getActualTypeArguments=[T], getTypeName=java.util.List<T>}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=true, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals(" {getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:2>", "<null>"}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:2>", "<null>"}}), new String[][]{{"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:m>", "<sample:3>", "<sample:1>"}}), new String[][]{{"appendQuotedUTF8", "byte[],int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:a>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:a>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:0>", "<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "findAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "wouldConflictWithName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#593#588418037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"withContentValueHandler", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"widenContentsBy", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericB...#668#1327948149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isJavaLangObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.FailingSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#735353829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.FailingSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired...#260#269891361", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=true, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-1>"}}, 3), new String[][]{{"getSerializationType", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:>", "<null>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", new String[]{"com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:5>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:p>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:o>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}}), new String[][]{{"withFilterId", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}), new String[][]{{"withFilterId", "java.lang.Object", "7"}, {"usesObjectId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}), new String[][]{{"withFilterId", "java.lang.Object", "7"}, {"usesObjectId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_new", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}, 1), new String[][]{{"withFilterId", "java.lang.Object", "7"}, {"usesObjectId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("[field generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text] {getAnnotationCount=0, getFullName=generated.algorithm.SearchInputFactory_scaffolding$TypeSampl.., getModifiers=1, getName=t...#238#-1675312401", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", actual.getClass().getName());
  assertEquals("[constructor for java.lang.String, annotations: [null]] {getAnnotationCount=0, getModifiers=1, getName=java.lang.String, getParameterCount=0, isPublic=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getDeclaringClass", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '<a><b>t</b></a>a{\"a\":1}' (virtual, no static serializer) {getName=<a><b>t</b></a>a{\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUn...#232#1525917587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.ClassSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=0, getViews=null,...#300#1206079362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"array\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1883172651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.EnumSetSerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, isUnw...#231#907584166", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "5"}, {"withFilterId", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#wildcard, static serializer of type com.fasterxml.jackson.databind.ser.std.JsonValueSerializer) {getName=0, getViews...#306#674535972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPoin...#250#-2000552232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ext.DOMSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=!NullPointerExcept...#241#2122349522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer...#277#1272597336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer...#277#1272597336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#values, static serializer of type com.fasterxml.jackson.databind.ser.std.ClassSerializer) {getName=, getViews=null, h...#298#-2029005950", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:7>", "<i:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:7>", "<i:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:By>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<s:B\t>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getFullName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isVirtual", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:5>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:7>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:k ey>", "<sample:2>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsOmittedField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-14>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMetadata", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsElement", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:kdy>", "<sample:4>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:2>", "<sample:3>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:6>", "<sample:1>"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.JsonNode"}, new String[]{"<sample:8>", "<sample:6>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}), new String[][]{{"getMetadata", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}), new String[][]{{"getMetadata", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}), new String[][]{{"getMetadata", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}), new String[][]{{"getMetadata", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}}), new String[][]{{"getMetadata", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"getMetadata", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#304#-1154787086", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (field \"generated.algorithm.SearchInputFactory_scaffolding$TypeSamples#text, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=0, getViews=...#305#409392529", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}), new String[][]{{"getFullName", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals(" {getNamespace=null, getSimpleName=, hasNamespace=false, hasSimpleName=false, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, ...#236#511701490", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}), new String[][]{{"getFullName", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}), new String[][]{{"getFullName", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}}, 2), new String[][]{{"getFullName", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<empty>"}}, 2), new String[][]{{"getFullName", "", "4"}, {"hasSimpleName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:3>"}}, 2), new String[][]{{"getFullName", "", "4"}, {"hasSimpleName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property 'sample' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=true, isR...#251#1196138951", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:3>"}}, 2), new String[][]{{"getFullName", "", "4"}, {"hasSimpleName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "readResolve", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getTypeSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:3>"}}, 2), new String[][]{{"getFullName", "", "4"}, {"hasSimpleName", "", "0"}, {"getNamespace", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '{\"a\":1}' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.std.CalendarSerializer) {getName={\"a\":1}, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequir...#246#1729361857", SearchInputFactory_scaffolding.receiverState());
 }
}
