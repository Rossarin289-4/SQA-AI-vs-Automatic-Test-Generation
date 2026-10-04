package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"0a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<i:-92>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0a/b'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0a/b, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isV...#213#1362897266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:7>", "<null>", "<i:-2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "1. 2345678/a/b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=1. 2345678/a/b, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, i...#215#-1115248486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:4>", "<null>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234561.12345678"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '1.12345678901234561.12345678'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=1.12345678901234561.12345678, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserial...#261#1495847906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:0>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "<s:a >"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:6>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"257"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=257, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual...#207#-1502063881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#1714935058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<s:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:1>", "<s:b>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:10>", "<s:>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:0>", "<s:Ca>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "1.1234567`8"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true,...#217#-108435714", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", ""}}, 1), new String[][]{{"getNamespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'H'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=H, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual...#207#-1635965720", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"1."}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '1.'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=1., getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtu...#209#-1468212892", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=0, getIndex=null, getRequired=true, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"hasSimpleName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-2147483648, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, is...#214#242203496", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"1.251.25"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=1.251.25, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtu...#209#939426403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:0>", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "-2"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "[,2]"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"-3"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-3, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#1123037608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"-10"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}}, 2), new String[][]{{"getContextAnnotation", "java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:3>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "10"}}, 2), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=STRING,locale=a_0_sample,timezone=a] {getPattern=0, getShape=STRING, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=10, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#177269195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=2147483647, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isV...#213#839821410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:0>"}}, 2), new String[][]{{"getCreatorIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"withValueHandler", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, null, 2), new String[][]{{"getLocale", "", "0"}, {"timeZoneAsString", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<b:true>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, null, 1), new String[][]{{"setManagedReferenceName", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '1.12345678901234567'] {getCreatorIndex=-1, getManagedReferenceName=, getName=1.12345678901234567, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=f...#239#1737945423", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "I-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=I-1.5, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#-902922539", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:7>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:0>", "<i:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<i:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 3), new String[][]{{"getType", "", "0"}, {"setManagedReferenceName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=-1, getManagedReferenceName=0, getName=0, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=!NullPointerExcepti...#220#-438409787", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=/a/b, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#-1973421176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<s:a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:2>", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:6>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#1714935058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "abc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=abc, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#1328422979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:3>", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true,...#217#-108435714", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=1.25, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, ...#216#-1485091920", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=1.25, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#1438051736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "-0."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"\u00e91.1234567890123456"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:3>", "<sample:4>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '\u00e91.1234567890123456'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=\u00e91.1234567890123456, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasView...#243#535223526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=2147483647, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, i...#215#6076446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<sample:5>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:-4>", "<b:false>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "0L"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=0L, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#-897834412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<empty>"}}), new String[][]{{"visibleInView", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:\n>", "<s:kkey>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s: b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:>", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=sample, getDescription=a, getIndex=7, getRequired=false, hasDefaultValue=true, hasDefuaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"134217729"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=134217729, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVi...#212#950721930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false), new String[][]{{"findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:4>", "<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}}), new String[][]{{"withoutFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false...#235#-1289810008", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}}), new String[][]{{"isRequired", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:13>"}, false), new String[][]{{"getShape", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Shape", actual.getClass().getName());
  assertEquals("ANY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:-56>", "<s:ley>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"\t "}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '\t '] {getCreatorIndex=-1, getManagedReferenceName=null, getName=\t , getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtu...#209#1710851480", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"tue"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'tue'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=tue, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVir...#211#-2025473240", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:>", "<i:-2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "1e10Hello,1World"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "2L"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=2L, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fals...#202#422449482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:0>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '123456789012345678901234567890true'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=123456789012345678901234567890true, getPropertyIndex=-1, hasValueDeserializer=false, hasValue...#273#1928393320", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:6>", "<sample:0>", "<s:>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual...#207#766199784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDese...#265#-1489749654", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:6>", "<empty>", "<s:kez>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#1950613233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("a {getNamespace=null, getSimpleName=a, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:a\r>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}}), new String[][]{{"hasNamespace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"\u00e91E-5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '\u00e91E-5'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=\u00e91E-5, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, i...#215#-394359480", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "\u00e9aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, isVirtual=...#206#1827849125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false), new String[][]{{"withPattern", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=ANY,locale=null,timezone=null] {getPattern=0, getShape=ANY, hasLocale=false, hasPattern=true, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual=f...#205#1139106216", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}), new String[][]{{"getMember", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=0, getIndex=null, getRequired=true, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=false, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:3>"}}), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_ABSENT,content=NON_EMPTY] {getContentInclusion=NON_EMPTY, getValueInclusion=NON_ABSENT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<null>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}}), new String[][]{{"getPropertyIndex", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 6, new String[][]{}), new String[][]{{"getMetadata", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", ""}}), new String[][]{{"hasSimpleName", "java.lang.String", "1"}, {"hasSimpleName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:1>"}}), new String[][]{{"hasTimeZone", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}}), new String[][]{{"hasIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "<null>"}}), new String[][]{{"withNamespace", "java.lang.String", "1"}, {"getNamespace", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"nEull"}, false), new String[][]{{"getPropertyIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"b1.5e3001e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'b1.5e3001e10'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=b1.5e3001e10, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRe...#229#707569304", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "[1,\n]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "2020-02-30T25:61:61-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}), new String[][]{{"hasShape", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "Tjtle"}}), new String[][]{{"getPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"-"}, false), new String[][]{{"getAnnotation", "java.lang.Class", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"-080\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:1>"}}), new String[][]{{"getObjectIdInfo", "", "6"}, {"withSimpleName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual...#207#1588401608", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:5>", "<sample:2>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDese...#265#-1489749654", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"/a/b1.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", ""}}), new String[][]{{"hasViews", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=false...#201#-735334109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:T>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "<i:-4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:2>", "<s:`>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "1"}, {"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<s:b[>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<null>", "<i:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<s:>"}}), new String[][]{{"hasSimpleName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getNamespace", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:a>", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "2020-02\r-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>"}, false), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}}), new String[][]{{"valueFor", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"0.20"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}), new String[][]{{"getFullName", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0.20 {getNamespace=null, getSimpleName=0.20, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "010/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=010/a/b, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtua...#208#-1439986859", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false), new String[][]{{"getIndex", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"-1"}, false), new String[][]{{"findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "05."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=false...#201#-735334109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "a+b-c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=a+b-c, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtua...#208#1589565543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}), new String[][]{{"getValueTypeDeserializer", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '1.5d'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=1.5d, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=!NullPoint...#229#-1151938910", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:aD>", "<i:-2147483648>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:7>", "<sample:1>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:3>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"nuBll"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=nuBll, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false...#218#-846737862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:0>"}}), new String[][]{{"getSimpleName", "", "0"}, {"getSimpleName", "", "3"}, {"withNamespace", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{} {getNamespace=, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=fa...#204#1286148181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaHaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:3>", "<i:0>"}}), new String[][]{{"getFullName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaHaaaaaaaa {getNamespace=null, getSimpleName=aaaaaaaaaaaaaaaaaaaaaHaaaaaaaa, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "-0/0a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=-0/0a, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=true, isVirtual=f...#205#690836673", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"a?"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<sample:1>"}}), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.5,dHello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "2147483647"}}), new String[][]{{"getMetadata", "", "0"}, {"withIndex", "java.lang.Integer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=null, getDescription=0, getIndex=4, getRequired=true, hasDefaultValue=false, hasDefuaultValue=false, hasIndex=true, isRequired=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=2147483647, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isV...#213#839821410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "2"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1E-5-0."}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "0"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:kkey>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '1E-5-0.'] {getCreatorIndex=-1, getManagedReferenceName=0, getName=1E-5-0., getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, i...#215#362068324", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=0, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fal...#203#1141456418", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "-0.0"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=-0.0, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#-1044946145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '/a/b'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=/a/b, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isV...#213#1590158196", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false), new String[][]{{"getRequired", "", "4"}, {"getDescription", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 3), new String[][]{{"hasLocale", "", "0"}, {"hasTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "123456789012345678901234667890"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "8"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "1"}}, 1), new String[][]{{"getPropertyIndex", "", "1"}, {"getName", "", "1"}, {"getCreatorIndex", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '\u00e9'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=\u00e9, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#-1514854266", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<b:true>", "<s:c>"}}), new String[][]{{"getFullName", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:0>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<null>", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<empty>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:0>", "<sample:1>", "<b:false>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"true0x123456789"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "0xGFFFFFFFF"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=true0x123456789, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false...#218#-1618460140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "cttp://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=-1, getManagedReferenceName=cttp://example.com/a?b=c, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequi...#226#806993123", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=cttp://example.com/a?b=c, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequi...#226#806993123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"PT1HTitle"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'PT1HTitle'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=PT1HTitle, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired...#223#-349866424", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property 'sample']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", ""}}), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "1"}, {"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#2075826566", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, false), new String[][]{{"valueFor", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonFormat {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonFormat, getClasses=[class com.fasterxml.jackson...#873#-766877138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"Ja"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=Ja, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fal...#203#-1784224262", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:8i>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:4>", "<s:b4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:5>", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "6"}, {"withFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=/a/b, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#-1973421176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:1>"}}, 1), new String[][]{{"hasValueTypeDeserializer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"-1.51.255."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=-1.51.255., getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVir...#211#-2121343289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}}), new String[][]{{"getCreatorIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isRequired=false, ...#216#-1480241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual...#207#766199784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"-0o"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '-0o'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=-0o, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVir...#211#372121640", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual...#207#766199784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "\n"}}, 1), new String[][]{{"getCreatorIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=\n, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fals...#202#-679614037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", ""}}, 1), new String[][]{{"valueFor", "", "0"}, {"withContentInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "2"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=NON_NULL] {getContentInclusion=NON_NULL, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '0']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#572328383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"{t"}, false, 0, null, 1), new String[][]{{"getAnnotation", "java.lang.Class", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false, isVirtual...#207#1253624742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"a"}, false, 2, new String[][]{}, 1), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"0x0x123456789"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}}, 1), new String[][]{{"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0x0x123456789'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=0x0x123456789, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isR...#231#750066950", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false,...#217#378989244", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", "java.lang.String", "a b0L"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b0L", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=a b0L, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=...#206#-1160953056", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}, 1), new String[][]{{"getIndex", "", "2"}, {"getIndex", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"15e300"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=15e300, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=fals...#219#-1238310393", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:6>", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.1234567a"}, false, 0, null, 2), new String[][]{{"getPropertyIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}}, 1), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=f...#205#651681258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=true, isVirtual=fa...#204#568634237", SearchInputFactory_scaffolding.receiverState());
 }
}
