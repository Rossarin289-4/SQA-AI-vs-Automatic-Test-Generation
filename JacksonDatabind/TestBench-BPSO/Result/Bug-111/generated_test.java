package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isVirtual", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:6>", "<i:-1>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:cc>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "java.lang.Exception", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:2>", "<s:cc>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:4>", "<s:ky>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findInjectableValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<s:y>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:5>", "<s: \nb>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:9>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getManagedReferenceName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:2>", "<s:cb>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findInjectableValue", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<s:ky>"}}), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#256#-1461936970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:6>", "<s:cb>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setFallbackSetter", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "markAsIgnorable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#264#955222585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"ITITLE"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FieldProperty", actual.getClass().getName());
  assertEquals("[property 'ITITLE'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=ITITLE, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#272#-673154234", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:bc>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "<i:53>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "set", "java.lang.Object,java.lang.Object", "<d:0.75>", "<b:false>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.MethodProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setManagedReferenceName", "java.lang.String", "/a/b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=/a/b, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#-281399139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "hasValueTypeDeserializer", ""}}), new String[][]{{"markAsIgnorable", "", "6"}, {"getCreatorIndex", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<null>", "<s:>"}}, 2), new String[][]{{"withName", "com.fasterxml.jackson.databind.PropertyName", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, ha...#267#-917960670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<s:s>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "readResolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:X>", "<i:4096>"}}), new String[][]{{"withName", "com.fasterxml.jackson.databind.PropertyName", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=f...#275#1959208483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getName", ""}}), new String[][]{{"depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}}), new String[][]{{"findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", ""}}), new String[][]{{"assignIndex", "int", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=2147483647, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false...#255#1891931643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:3>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s: \nb>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<sample:3>"}}), new String[][]{{"withName", "com.fasterxml.jackson.databind.PropertyName", "7"}, {"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:3>", "<sample:5>"}}), new String[][]{{"getCreatorIndex", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getFullName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:6>", "<i:-1>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=32, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequir...#226#-875617692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setManagedReferenceName", "java.lang.String", "1-25Title"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}}), new String[][]{{"withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "2"}, {"getCreatorIndex", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"ure"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getManagedReferenceName", ""}}), new String[][]{{"getAnnotation", "java.lang.Class", "1"}, {"getMember", "", "1"}, {"call", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "visibleInView", "java.lang.Class", "<sample:4>"}}), new String[][]{{"getName", "", "5"}, {"getAnnotation", "java.lang.Class", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "hasViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:5>", "<s:cc>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getMember", ""}}), new String[][]{{"assignIndex", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.MethodProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#-1970409845", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:k>", "<i:102>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnora...#245#873534563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 1, new String[][]{}), new String[][]{{"withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property 'abc'] {getCreatorIndex=8, getManagedReferenceName=null, getName=abc, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRe...#230#1726206872", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMember", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedField", actual.getClass().getName());
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "true"}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "5"}, {"lazySet", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.concurrent.atomic.AtomicReference", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "set", "java.lang.Object,java.lang.Object", "<i:84>", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "referenceValue", "java.lang.Object", "<sample:0>"}}), new String[][]{{"getEmptyValue", "", "5"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMember", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:5>", "<d:3.0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1..1234"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<i:-1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}), new String[][]{{"assignIndex", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "updateReference", new String[]{"java.util.concurrent.atomic.AtomicReference", "java.lang.Object"}, new String[]{"<empty>", "<s:key>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:1>"}}, 2), new String[][]{{"setOpaque", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.concurrent.atomic.AtomicReference", actual.getClass().getName());
  assertEquals("true", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: null] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", "java.lang.Object", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "hasViews", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '0'; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fa...#258#-1214638003", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isRequired", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<s:key>", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "isIgnorable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findAliases", "com.fasterxml.jackson.databind.cfg.MapperConfig", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getValueDeserializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<s:yy>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=null, getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, getValueNulls=null, hasDefaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "withResolved", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:8>", "<sample:6>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getValueType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setViews", "java.lang.Class[]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=true...#255#-1320289741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "markAsIgnorable", ""}}, 3), new String[][]{{"isRequired", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnor...#246#-332439692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "<s:ac>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "assignIndex", new String[]{"int"}, new String[]{"37"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 2), new String[][]{{"simpleAsEncoded", "com.fasterxml.jackson.databind.cfg.MapperConfig", "6"}, {"asQuotedUTF8", "", "0"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false,...#234#-766745983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_nonNullNumber", "java.lang.Number", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgno...#247#1248810627", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "false"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:4>", "<s:ky>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "findAliases", "com.fasterxml.jackson.databind.cfg.MapperConfig", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getMetadata", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getNullAccessPattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '-1.5'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=-1.5, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews...#261#-1338357804", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getMember", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isVirtual", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedMethod", actual.getClass().getName());
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setViews", "java.lang.Class[]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "isVirtual", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:3>", "<i:0>"}}, 3), new String[][]{{"getCreatorIndex", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "markAsIgnorable", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:7>", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isIgnorable", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=9, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-374512668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueTypeDeserializer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaa`aaaaaa"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:8>", "<sample:8>", "<sample:5>", "{\"a\":1x"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 2), new String[][]{{"getPropertyIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"27"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "'"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "0x123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("as content of type '[collection type; class java.lang.Object, contains $0]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:10>", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=9, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-374512668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getMember", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findInjectableValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:  /b>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:5>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "set", "java.lang.Object,java.lang.Object", "<s:!>", "<i:-8192>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "set", "java.lang.Object,java.lang.Object", "<s:>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "visibleInView", "java.lang.Class", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:46>", "<s: /b{>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getFullName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"[1,1]"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=[1,1], getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fal...#257#2096917533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setManagedReferenceName", "java.lang.String", "0x12347"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:8>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=0x12347, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fal...#257#1755058259", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=0x12347, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDes...#285#173515659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getContextAnnotation", "java.lang.Class", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "referenceValue", "java.lang.Object", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:0>", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 2), new String[][]{{"getPattern", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:3>", "<s:cb>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_hasTextualNull", "java.lang.String", "1..5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, has...#266#-101436799", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=fals...#219#-436854674", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getMetadata", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=AS_EMPTY, getDefaultValue=sample, getDescription=a, getIndex=11, getRequired=false, getValueNulls=FAIL, hasDefaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getName", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "assignIndex", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=AS_EMPTY, getDefaultValue=sample, getDescription=a, getIndex=11, getRequired=false, getValueNulls=FAIL, hasDefaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "') "}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:0>", "<i:54>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<empty>", "<s:cc>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("for type '[simple type, class java.lang.Object]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:9>", "<sample:5>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("as content of type '[collection-like type; class java.lang.Object, contains $0]'", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getMember", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "updateReference", "java.util.concurrent.atomic.AtomicReference,java.lang.Object", "<sample:2>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isIgnorable", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getCreatorIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getMember", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "W..5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "isRequired", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:3>", "<null>"}}), new String[][]{{"getAnnotation", "java.lang.Class", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "<sample:3>", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getValueTypeDeserializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getDeclaringClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:4>", "<s:bc>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findBackReference", "java.lang.String", "/ar/b"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withSimpleName", "java.lang.String", "ure"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:2>", "<i:-23>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findInjectableValue", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s: b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "0x123456789"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:4>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:1>", "<d:2.0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:m>", "<s:be>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:2>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 7, new String[][]{}), new String[][]{{"getInjectableValueId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#256#-1461936970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<s: \n\nb>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<null>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:1>", "<i:-2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "handledType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.lang.Object"}, new String[]{"<s: ,bf>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName={\"a\":1}, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, h...#268#1425593239", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#-198467282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getFullName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=true, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-739700002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:8>", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isRequired=f...#222#342751598", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.concurrent.atomic.AtomicReference", actual.getClass().getName());
  assertEquals("null", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasViews", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:0>", "<i:-39>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNumberForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser", "<sample:3>", "<sample:2>"}}), new String[][]{{"getDelegatee", "", "2"}, {"getNullValue", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getMember", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-21"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "<sample:9>", "null"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"5>."}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '5>.'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=5>., getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=f...#259#-452373690", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getAnnotation", "java.lang.Class", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"1048567"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", "java.lang.String", "a"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "withResolved", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getContextAnnotation", "java.lang.Class", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getFullName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:6>"}, false), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getManagedReferenceName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:4>", "<i:23>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getValueTypeDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "-47"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-47, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fa...#258#38525753", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-47, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fal...#257#-1673941278", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getInjectableValueId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<s:i>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:8>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:11>", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "1.12345678901234560xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("for type `java.lang.Object`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "java.lang.Exception", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired...#224#492015220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:1>", "<null>"}}), new String[][]{{"getObjectIdInfo", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FieldProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false,...#234#-766745983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getFullName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=32, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequir...#226#-875617692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:9>", "<s:E>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getNullValueProvider", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:3>", "<s:bX>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:8>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:1>", "<s:i.>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "java.lang.Exception", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a><b>t</b></a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:1>", "<i:84>"}}), new String[][]{{"getAnnotation", "java.lang.Class", "4"}, {"hasValueDeserializer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{}), new String[][]{{"findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "visibleInView", "java.lang.Class", "<null>"}}), new String[][]{{"isIgnorable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<i:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"-29"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isIgnorable", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false,...#234#-766745983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getMetadata", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "isVirtual", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "java.lang.Exception", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#256#-1461936970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueTypeDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=true...#255#-1320289741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:0>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isRequired", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withSimpleName", "java.lang.String", "0xFEFFFFFF"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:null; id-resolver: null] {getPropertyName=a, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"i 1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.MethodProperty", actual.getClass().getName());
  assertEquals("[property 'i 1.5d'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=i 1.5d, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#272#1621891934", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "markAsIgnorable", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#255#-1584885611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"'"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<s:x>", "<d:3.7800000000000002>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '''; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=', getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=f...#259#1420157790", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#-198467282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getValueClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:null; id-resolver: null] {getPropertyName=a, getTypeInclusion=EXTERNAL_PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:10>", "<i:57>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "<i:-61>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"a,bc"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "taaaaaaaaaaaaaaaaaaabaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:9>", "<s:E>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "isIgnorable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasViews", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, ...#233#-1938523690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getNullValueProvider", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getFullName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getInjectableValueId", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setManagedReferenceName", "java.lang.String", "010http://example.com/a?b=c0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=010http://example.com/a?b=c0x1F, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isI...#250#-149354720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getWrapperName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired...#224#262812746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "isIgnorable", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "depositSchemaProperty", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getPropertyIndex", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getWrapperName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:cc>", "<s:i>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "withResolved", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"withMergeInfo", "com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo", "4"}, {"getDescription", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=32, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequir...#226#-875617692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.MethodProperty", actual.getClass().getName());
  assertEquals("[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isVirtual", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<s:aa>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "set", "java.lang.Object,java.lang.Object", "<s: /b>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName={sample}0, scope=`java.lang.Comparable`, generatorType=`java.lang.Number`, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired...#224#262812746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"nulm"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=nulm, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1022155048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:4>", "<i:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:bcb>", "<s:ii>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseBooleanFromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"\"a\":11}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", "java.lang.String", "0x1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '\"a\":11}'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=\"a\":11}, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fa...#258#-1488702344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<b:true>", "<s:a'>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueTypeDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
}
