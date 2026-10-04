package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}), new String[][]{{"hasSerializer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<i:0>", "<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}, {"getPropertyType", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<b:true>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:Abb>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:Aabbc>", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:'>", "<sample:6>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:@Abbbb>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:@bb>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<d:-13.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<sample:2>", "<d:1.5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:Abbb>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-13.5>", "<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:@bb>"}}, 1), new String[][]{{"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "3"}, {"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property ' x \t y line1\n\nline3' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {g...#304#1031172721", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:Abb>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:\rbb>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:0>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:7>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:b>", "<i:-1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<i:-1>", "<sample:4>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:7>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<i:-2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:1>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:/b>", "<sample:8>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:1>"}}, 3), new String[][]{{"isUnwrappingSerializer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"fixAccess", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}}, 2), new String[][]{{"asUnquotedUTF8", "", "5"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"serializeContents", "java.lang.String[],com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}}, 2), new String[][]{{"hasAnnotation", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<empty>", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 2), new String[][]{{"isArrayType", "", "4"}, {"isInterface", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:Abab>", "<null>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<i:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:Abb\">", "<s:h>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:5>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 3), new String[][]{{"getRawParameterType", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:1>", "<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:kWy>", "<sample:4>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:;b>", "<sample:1>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:3>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:Absb>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:>", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getSerializedName", "", "0"}, {"getAnnotation", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:9>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:>", "<s:A>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:Abb>", "<sample:7>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#566#5919511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:Abbb>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:Abb#b>", "<s:Abbbb>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#566#5919511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:WAbb#b>", "<sample:6>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:Abbzb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:8>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:3>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:10>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("0 {getValue=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:0.15>", "<sample:4>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:key>", "<sample:4>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:2>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("[method java.lang.String#charAt(1 params)] {getAnnotationCount=!NullPointerException, getFullName=java.lang.String#charAt(1 params), getGenericParameterTypes=[int], getModifiers=1, getName=charAt, get...#260#1581514493", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:AA'b>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:`>", "<b:true>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"addOrOverride", "java.lang.annotation.Annotation", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:57>", "<sample:7>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<i:-18>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#566#1918679286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:3>"}}), new String[][]{{"writeQuotedUTF8", "java.io.OutputStream", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:2>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:b(>", "<i:-1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}), new String[][]{{"annotationType", "", "5"}, {"annotationType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"withContentTypeHandler", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:ABbbbb>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<i:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:fAbb>", "<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}), new String[][]{{"isAbstract", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.BooleanSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:b>", "<sample:7>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}), new String[][]{{"unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"hasSerializer", "", "3"}, {"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}}), new String[][]{{"getGenericComponentType", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.TypeVariableImpl", actual.getClass().getName());
  assertEquals("T {getAnnotatedBounds=?, getAnnotations=[], getBounds=[class java.lang.Object], getDeclaredAnnotations=[], getName=T, getTypeName=T}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<s:AbC>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:AA'b>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:D>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>"}}), new String[][]{{"getSerializationType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#566#1918679286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:ACbbbb>", "<sample:7>", "<sample:6>"}}), new String[][]{{"isArrayType", "", "2"}, {"getErasedSignature", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false), new String[][]{{"getSerializationType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", ""}}), new String[][]{{"serialize", "java.util.Collection,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}}), new String[][]{{"annotationType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"handledType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s: bbb>", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals(" {getValue=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getValueHandler", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
  assertEquals("property '{\"a\":1} x \t y ' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getNam...#295#-1616817504", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:4>", "<sample:4>", "<sample:8>"}}), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"array\",\"items\":{\"type\":\"string\"}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, i...#352#-1410641982", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<s:+lkey>"}}), new String[][]{{"getRawSerializationType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:A@'b>", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<empty>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<s:AEbb#b>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:`>", "<sample:7>", "<sample:7>"}}), new String[][]{{"getContextAnnotation", "java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<s:A>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:9>", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:!`>", "<s:Abb#b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:@bb>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", ""}}, 3), new String[][]{{"getTypeHandler", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#566#5919511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:8>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}), new String[][]{{"getTypeHandler", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<s:key>", "<i:2>"}}), new String[][]{{"getGenericSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:7>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:2>", "<sample:7>"}}, 3), new String[][]{{"getWrapperName", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}), new String[][]{{"getGenericComponentType", "", "1"}, {"getGenericDeclaration", "", "1"}, {"getGenericDeclaration", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:Abb#b>", "<sample:6>", "<sample:6>"}}), new String[][]{{"getTypeName", "", "5"}, {"getTypeName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:2>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.Object; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#-1824092172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"getGenericSignature", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"getTypeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}), new String[][]{{"putQuotedUTF8", "java.nio.ByteBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}), new String[][]{{"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:AbbHb>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}), new String[][]{{"getParameterCount", "", "0"}, {"getAnnotated", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.reflect.Method", actual.getClass().getName());
  assertEquals("public char java.lang.String.charAt(int) {getAnnotatedExceptionTypes=[], getAnnotatedParameterTypes=?, getAnnotations=[], getDeclaredAnnotations=[], getExceptionTypes=[], getGenericExceptionTypes=[], ...#423#47668453", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}), new String[][]{{"asQuotedUTF8", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-1>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:4>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}), new String[][]{{"asQuotedChars", "", "4"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:@bb#b>", "<sample:7>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:@b\tb>", "<sample:6>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", new String[]{"com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "java.lang.Class", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<sample:0>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 2), new String[][]{{"rename", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}, {"getSerializedName", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>{\"a\":1} {getValue=<a><b>t</b></a>{\"a\":1}}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#266#-1701443123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2), new String[][]{{"containedTypeCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", "java.lang.Object", "<s:@bbbb>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsColumn", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:Abbb>", "<null>", "<sample:5>"}}), new String[][]{{"hasGenericTypes", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2), new String[][]{{"containedType", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_handleSelfReference", "java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer", "<i:-1>", "<null>"}}), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setInternalSetting", "java.lang.Object,java.lang.Object", "<i:-34>", "<s:7ey>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", ""}}), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<i:-50>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.node.ObjectNode", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_findAndAddDynamic", "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializer", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.BooleanSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getPropertyType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("char {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=char, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredF...#346#727551571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "removeInternalSetting", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("a {getValue=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:6>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "3"}, {"deleteCharAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getInternalSetting", "java.lang.Object", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("sun.reflect.generics.reflectiveObjects.GenericArrayTypeImpl", actual.getClass().getName());
  assertEquals("T[] {getTypeName=T[]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsField", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:AvbAb>", "<sample:1>", "<sample:0>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getMember", ""}}), new String[][]{{"assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "hasNullSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "get", "java.lang.Object", "<i:24>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "willSuppressNulls", ""}}, 1), new String[][]{{"charLength", "", "3"}, {"writeQuotedUTF8", "java.io.OutputStream", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "serializeAsPlaceholder", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:3>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "isRequired", ""}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "depositSchemaProperty", "com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"isThrowable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getGenericPropertyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#566#1918679286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 1), new String[][]{{"annotationType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "rename", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasS...#233#-169107834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getRawSerializationType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignNullSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "getSerializedName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "property '0' (via method java.lang.String#charAt, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer) {getName=0, getViews=null, hasNullSerializer=true, hasSe...#232#1428071735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "setNonTrivialBaseType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "property '' (field \"generated.algorithm.SearchInputFactory_scaffolding$GenericBase#array, static serializer of type com.fasterxml.jackson.databind.ser.impl.StringArraySerializer) {getName=, getViews=n...#267#1600179376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "assignSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
