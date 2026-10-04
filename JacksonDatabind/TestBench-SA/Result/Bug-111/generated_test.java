package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:a>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getType", ""}}), new String[][]{{"getMember", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #10, annotations: null] {getFullName=!NullPointerException, getIndex=10, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isRequired=f...#222#2128154860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "referenceValue", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:5>", "<d:1.3599999999999999>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FieldProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:kex>", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "set", "java.lang.Object,java.lang.Object", "<s:key>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FieldProperty", actual.getClass().getName());
  assertEquals("[property '12:30:45'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=12:30:45, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=...#276#1363814234", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.112345678901234567"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property '1.112345678901234567'] {getCreatorIndex=8, getManagedReferenceName=null, getName=1.112345678901234567, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasVie...#263#1090089189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "readResolve", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getMember", ""}}, 2), new String[][]{{"getValueDeserializer", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:1>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "readResolve", ""}}), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getFullName", ""}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:3>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:0>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<b:false>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getAnnotation", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:0>", "<s:2>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "markAsIgnorable", ""}}, 2), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer; base-type:null; id-resolver: null] {getPropertyName=0, getTypeInclusion=WRAPPER_OBJECT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'true'] {getCreatorIndex=64, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false...#253#-1646376534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:3>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:5>"}}), new String[][]{{"setAndReturn", "java.lang.Object,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<d:3.0>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getAnnotation", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>"}}), new String[][]{{"assignIndex", "int", "1"}, {"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:8>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>"}}, 1), new String[][]{{"getContextAnnotation", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasViews", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:0.991>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "updateReference", "java.util.concurrent.atomic.AtomicReference,java.lang.Object", "<sample:4>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.991", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<s:^>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getObjectIdInfo", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<null>", "<i:2147483647>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:5>", "<s:lkfXy>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getPropertyIndex", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getDeclaringClass", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setFallbackSetter", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueTypeDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "inject", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:0>"}}), new String[][]{{"getInjectableValueId", "", "1"}, {"isIgnorable", "", "6"}, {"withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withNullProvider", new String[]{"com.fasterxml.jackson.databind.deser.NullValueProvider"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<s:fa>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "findInjectableValue", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<b:false>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}}), new String[][]{{"getCreatorIndex", "", "5"}, {"withName", "com.fasterxml.jackson.databind.PropertyName", "6"}, {"withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '<a><b>t</b></a>'; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDes...#286#-629639043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#-198467282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"hi3"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:7>", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "visibleInView", "java.lang.Class", "<sample:3>"}}), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:9>", "<sample:3>", "<s:\r\t>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "assignIndex", "int", "-16337"}}), new String[][]{{"withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "0"}, {"deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "assignIndex", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withSimpleName", "java.lang.String", "2147483648"}}, 3), new String[][]{{"withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "3"}, {"deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "set", "java.lang.Object,java.lang.Object", "<i:-1073741824>", "<s:kd.x>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "assignIndex", "int", "-11"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withSimpleName", "java.lang.String", "2137483648--11.12345678:0123456"}}, 3), new String[][]{{"visibleInView", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<s:bb>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getAnnotation", "java.lang.Class", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isRequired", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:1>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{".51"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "<a>b</a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=AS_EMPTY, getDefaultValue=sample, getDescription=a, getIndex=11, getRequired=false, getValueNulls=FAIL, hasDefaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=AS_EMPTY, getDefaultValue=sample, getDescription=a, getIndex=11, getRequired=false, getValueNulls=FAIL, hasDefaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=null, getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, getValueNulls=null, hasDefaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-2, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired...#224#129012806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=null, getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, getValueNulls=null, hasDefaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#254#-1596248192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 2), new String[][]{{"withIndex", "java.lang.Integer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=null, getDefaultValue=null, getDescription=null, getIndex=1, getRequired=null, getValueNulls=null, hasDefaultValue=false, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#254#-1596248192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}}, 2), new String[][]{{"withIndex", "java.lang.Integer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=null, getDefaultValue=null, getDescription=null, getIndex=1, getRequired=null, getValueNulls=null, hasDefaultValue=false, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=4, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1592196983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<d:1.5>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<d:1.5>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<d:1.5>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<s:kex>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnora...#245#873534563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnora...#245#873534563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-2147483648, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, i...#252#974990783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMember", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-2147483648, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, i...#252#974990783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMember", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:7>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-2147483648, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, i...#252#974990783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasViews", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMember", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:7>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getInjectableValueId", ""}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getWrapperName", ""}}, 2), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getType", ""}}, 2), new String[][]{{"getMember", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #10, annotations: null] {getFullName=!NullPointerException, getIndex=10, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isRequired=f...#222#2128154860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getType", ""}}, 2), new String[][]{{"getMember", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #10, annotations: null] {getFullName=!NullPointerException, getIndex=10, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:r>", "<i:-20>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getValueTypeDeserializer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "assignIndex", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=0, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false...#255#-1479232030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<null>", "<null>", "<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "markAsIgnorable", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=256, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false...#255#-1492530085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=256, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fa...#258#791037010", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=-10, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false...#254#-1716797764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getFullName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:9>", "<i:-65536>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:kdy>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:kdy>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:kdy>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", "java.lang.Class[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:5.359999999999999>", "<s:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id 'true'] {getCreatorIndex=64, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, h...#267#-608184284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "isVirtual", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", "java.lang.Class[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:5.359999999999999>", "<s:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=32, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=tru...#256#-1514318107", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "isVirtual", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", "java.lang.Class[]", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:5.359999999999999>", "<s:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=tru...#256#566265571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "isVirtual", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", "java.lang.Class[]", "<null>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:5.359999999999999>", "<s:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=32, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#1942331758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "isVirtual", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", "java.lang.Class[]", "<null>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:5.359999999999999>", "<s:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id 'true'] {getCreatorIndex=64, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, h...#268#-32290801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getMember", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<s:kdx>", "<s:\n>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:kex>", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:kex>", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}, {"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:1>", "<i:3>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:1>", "<i:3>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>"}}, 3), new String[][]{{"listIterator", "", "0"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:5>"}}, 3), new String[][]{{"getCreatorIndex", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:5>"}}, 3), new String[][]{{"getValueTypeDeserializer", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:null; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnor...#246#-332439692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:6>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", "java.lang.String", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>'] {getCreatorIndex=6, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, ...#253#-2031953347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getManagedReferenceName", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnora...#245#873534563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgno...#246#-209540190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=2147483647, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isR...#231#2121841359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"2130706431"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=2130706431, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isR...#231#-1174901452", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-2147483648, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, is...#232#310852169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-2147483648, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isR...#231#1481094826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getWrapperName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=2, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isRequired=fa...#221#2071786002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnor...#246#-332439692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "java.lang.Exception", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "7"}, {"getNullAccessPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnor...#246#-332439692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.util.concurrent.atomic.AtomicReference"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getObjectIdReader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:2>", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"'; inject id '"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "<a>b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getInjectableValueId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=AS_EMPTY, getDefaultValue=sample, getDescription=a, getIndex=11, getRequired=false, getValueNulls=FAIL, hasDefaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getInjectableValueId", ""}}), new String[][]{{"getRequired", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getMetadata", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.5>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getContentNulls=null, getDefaultValue=null, getDescription=null, getIndex=null, getRequired=null, getValueNulls=null, hasDefaultValue=false, hasIndex=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '<a><b>t</b></a>'] {getCreatorIndex=4, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false,...#254#-1596248192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '0'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false...#255#-728252250", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "inject", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '<a><b>t</b></a>'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeser...#283#-521479898", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "inject", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:key>"}}), new String[][]{{"getObjectIdInfo", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getContextAnnotation", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getContextAnnotation", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getContextAnnotation", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<null>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<d:1.5>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<d:1.5>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<d:1.5>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getWrapperName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:3>", "<sample:2>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true...#255#-1338359185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=USE_DEFAULTS,content=USE_DEFAULTS) {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=9, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-374512668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setManagedReferenceName", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=USE_DEFAULTS,content=USE_DEFAULTS) {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=9, getManagedReferenceName=1.1234567890123456, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=fals...#237#-733534704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withSimpleName", "java.lang.String", "1"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setManagedReferenceName", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=USE_DEFAULTS,content=USE_DEFAULTS) {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=9, getManagedReferenceName=1.1234567890123456, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=fals...#237#-733534704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<s:a>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getNullValueProvider", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<s:kex>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<s:kex>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#245#-743830419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnora...#245#873534563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:5>", "<s:kex>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorab...#243#684346029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true...#255#-1338359185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "findPropertyFormat", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", new String[]{"java.lang.Exception"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeWith", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", "java.lang.String", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getNullValueProvider", ""}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", "java.lang.String", "1.1234567890123456"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=12, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#2015916336", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.MethodProperty", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "visibleInView", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired...#224#492015220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setViews", "java.lang.Class[]", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isRequired=...#223#1071296799", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isIgnorable=false, isRequired=f...#222#2128154860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<i:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:2>", "<s:kex>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<s:kdx>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "visibleInView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "markAsIgnorable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:3>", "<empty>", "<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "visibleInView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "markAsIgnorable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<null>", "<null>", "<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "markAsIgnorable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:7>", "<empty>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "visibleInView", "java.lang.Class", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-390117217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "isIgnorable", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseBytePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=256, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false...#255#-1492530085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMetadata", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isRequired", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getFullName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getFullName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getFullName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{sample}0 {getNamespace=sample, getSimpleName=0, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnor...#246#-332439692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getFullName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName={a}, scope=`java.lang.Integer`, generatorType=`java.lang.Object`, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=sample, scope=`int`, generatorType=`java.lang.String[]`, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getPropertyName", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getContextAnnotation", "java.lang.Class", "<empty>"}}), new String[][]{{"getPropertyName", "", "6"}, {"hasSimpleName", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeSetAndReturn", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<i:-2147483648>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isRequired", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:6>", "<empty>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:kdy>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#253#2020418622", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<s:kdx>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getContextAnnotation", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "inject", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Exception"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:0>", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=32, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#1942331758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:0>", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id 'true'] {getCreatorIndex=64, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, h...#268#-32290801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "fixAccess", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "setViews", "java.lang.Class[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.CreatorProperty", "set", "java.lang.Object,java.lang.Object", "<d:1.3599999999999999>", "<s:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id 'true'] {getCreatorIndex=64, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, h...#267#-608184284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getName", ""}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getCreatorIndex", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getPropertyIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.25"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.MethodProperty", actual.getClass().getName());
  assertEquals("[property '1.25'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=1.25, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, i...#268#-2034674332", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getValueTypeDeserializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property 'sample']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMetadata", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMetadata", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getReferenced", new String[]{"java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getMetadata", ""}, {"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:3>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.CreatorProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getMember", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.CreatorProperty", "isRequired", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotatedParameter", actual.getClass().getName());
  assertEquals("[parameter #10, annotations: [null]] {getFullName=!NullPointerException, getIndex=10, getModifiers=!NullPointerException, getName=, isPublic=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:6>", "<empty>", "<s:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=9, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-374512668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getPropertyIndex", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:5>", "<sample:1>", "<s:3>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "setViews", "java.lang.Class[]", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "withNullProvider", "com.fasterxml.jackson.databind.deser.NullValueProvider", "<null>"}}), new String[][]{{"setViews", "java.lang.Class[]", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", actual.getClass().getName());
  assertEquals("[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=true...#255#-1320289741", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=true...#255#-1320289741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"12:30:451.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "set", "java.lang.Object,java.lang.Object", "<s:key>", "<i:1>"}}), new String[][]{{"getValueDeserializer", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:1>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "getWrapperName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "hasValueTypeDeserializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_deserializeWrappedValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "visibleInView", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<s:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getContextAnnotation", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:3>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=ALWAYS_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:3>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", "java.lang.String", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:3>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_isNaN", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false, isIgnor...#246#-332439692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getType", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "findPropertyInclusion", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnorabl...#243#561446527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "getDeclaringClass", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property '<a><b>t</b></a>'] {getCreatorIndex=6, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, ...#253#-2031953347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", actual.getClass().getName());
  assertEquals("[property '0'] {getCreatorIndex=6, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequire...#225#-1790354619", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "<s:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgnora...#245#873534563", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorab...#243#684346029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorab...#244#431204472", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isIgno...#246#-209540190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=10, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-255048190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "assignIndex", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=2147483647, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isR...#231#2121841359", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("DEFAULT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("AS_EMPTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getValueDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-1105123257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "findAliases", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "visibleInView", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "getAnnotation", "java.lang.Class", "<sample:0>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnorable=false, isRequired=...#223#-618049531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fals...#256#-632723488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property '0'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, isIgnora...#245#-866729921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "getValueClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=DYNAMIC, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.FieldProperty", "com.fasterxml.jackson.databind.deser.impl.FieldProperty", "assignIndex", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.FieldProperty", "withSimpleName", "java.lang.String", "010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty", "setManagedReferenceName", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "fixAccess", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "isIgnorable", ""}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getWrapperName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueTypeDeserializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.SetterlessProperty", "hasValueTypeDeserializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.MethodProperty", "com.fasterxml.jackson.databind.deser.impl.MethodProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:1>", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.MethodProperty", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "markAsIgnorable", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fals...#256#-1192876252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getNullValueProvider", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "markAsIgnorable", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'a'] {getCreatorIndex=!IllegalStateException, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isIgnor...#246#997499480", SearchInputFactory_scaffolding.receiverState());
 }
}
