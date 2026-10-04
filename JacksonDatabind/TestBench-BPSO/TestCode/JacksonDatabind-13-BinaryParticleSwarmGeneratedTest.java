package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "checkUnresolvedObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "createInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.InjectableValues", "<sample:0>", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<i:-11>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<i:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", actual.getClass().getName());
  assertEquals("{hasReferringProperties=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<null>", "<sample:7>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "keyDeserializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}), new String[][]{{"getValueTypeDeserializer", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "deserializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "copy", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "keyDeserializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:0>", "<d:15.0>"}}, 2), new String[][]{{"parseDate", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:0>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<i:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "checkUnresolvedObjectId", ""}}), new String[][]{{"referringProperties", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "with", new String[]{"com.fasterxml.jackson.databind.deser.DeserializerFactory"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdStringException", "java.lang.Class,java.lang.String", "<null>", ",-1"}}), new String[][]{{"deserializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:0>", "<s:k?fy>"}}, 3), new String[][]{{"setAndReturn", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "checkUnresolvedObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<i:-11>", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "1.1234", "TJTLE"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<s:k>", "<sample:5>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<i:-1>", "<sample:4>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getActiveView", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "returnObjectBuffer", new String[]{"com.fasterxml.jackson.databind.util.ObjectBuffer"}, new String[]{"<sample:9>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getActiveView", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findInjectableValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Object"}, new String[]{"<d:1.5>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object", "<sample:2>", "<s:ke yB>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=a, getDescription=sample, getIndex=5, getRequired=false, hasDefaultValue=true, hasDefuaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{".6"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '.6'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=.6, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_calcName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "returnObjectBuffer", new String[]{"com.fasterxml.jackson.databind.util.ObjectBuffer"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "checkUnresolvedObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:9>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:-12>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", actual.getClass().getName());
  assertEquals("{hasReferringProperties=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "readPropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "readPropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:7>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasDeserializationFeatures", new String[]{"int"}, new String[]{"2"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getConfig", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findKeyDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getBase64Variant", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportUnknownProperty", new String[]{"java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<s:key>", ".1", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "endOfInputException", "java.lang.Class", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "keyDeserializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<s:k0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "instantiationException", "java.lang.Class,java.lang.Throwable", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{"1."}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 1. {getLocalizedMessage=1., getMessage=1., getOriginalMessage=1., getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingExcep...#233#-214749978", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "checkUnresolvedObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "instantiationException", "java.lang.Class,java.lang.Throwable", "<empty>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{"Tiule0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<s:kdy>", ".ull", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findRootValueDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 1), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Tiule0 (through reference chain: java.lang.Integer[\"\"]) {getLocalizedMessage=Tiule0 (through reference chain: java.lang.Integer[\"\"]), getMessage=Ti...#417#-91586062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportUnknownProperty", new String[]{"java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<s:mb>", "0xFF", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getAnnotation", "java.lang.Class", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "determineClassName", new String[]{"java.lang.Object"}, new String[]{"<s:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_valueDesc", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[N/A]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<i:-27>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<b:true>", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", actual.getClass().getName());
  assertEquals("{hasReferringProperties=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.String", "aa"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "leaseObjectBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdNumberException", "java.lang.Class,java.lang.String", "<sample:0>", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ObjectBuffer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "checkUnresolvedObjectId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:4>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"getLocalizedMessage", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Can not deserialize instance of java.lang.Integer out of FIELD_NAME token", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getConfig", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "parseDate", new String[]{"java.lang.String"}, new String[]{"1/1<234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "endOfInputException", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_desc", "java.lang.String", "-B"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:3>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Unexpected end-of-input when trying to deserialize a generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getLocalizedMessage=Unexpected...#526#-1089555900", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "parseDate", new String[]{"java.lang.String"}, new String[]{"http://exaole.com/a?b=c"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "wrongTokenException", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonToken,java.lang.String", "<null>", "<sample:0>", "abc"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<s:k=>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<i:-56>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"resolve", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findNonContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getTypeFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_valueDesc", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "determineClassName", new String[]{"java.lang.Object"}, new String[]{"<d:1.24>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdNumberException", "java.lang.Class,java.lang.String", "<empty>", "V+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Double", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:3>", "<s:b>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdStringException", "java.lang.String,java.lang.Class,java.lang.String", "Title", "<sample:4>", "-1.55"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:-12>", "<sample:5>", "<sample:7>"}, false, 4, new String[][]{}, 2), new String[][]{{"getKey", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<i:4>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<s:\n>", "<sample:5>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", actual.getClass().getName());
  assertEquals("{hasReferringProperties=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getContextualType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdNumberException", "java.lang.Class,java.lang.String", "<null>", "a b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<null>", "<sample:7>", "` b1.5e300"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getActiveView", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getArrayBuilders", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findInjectableValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Object"}, new String[]{"<d:1.5>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "copy", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:4>"}}, 2), new String[][]{{"deserializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<s:n>", "<null>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findInjectableValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Object"}, new String[]{"<i:-2>", "<sample:2>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "readValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_desc", "java.lang.String", "0-11"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "readPropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:2>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "keyDeserializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:1>", "<d:-55.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdNumberException", "java.lang.Class,java.lang.String", "<sample:3>", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:8>", "<sample:0>", "<s:=>", "\u00e9"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "isRequired", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "endOfInputException", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportUnknownProperty", new String[]{"java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<i:4>", "\\1,2]", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "endOfInputException", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Unexpected end-of-input when trying to deserialize a java.lang.Object {getLocalizedMessage=Unexpected end-of-input when trying to deserialize a jav...#480#-774671772", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findInjectableValue", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Object"}, new String[]{"<b:true>", "<null>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:6>", "<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "copy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "parseDate", new String[]{"java.lang.String"}, new String[]{"Sitle"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getNodeFactory", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "depositSchemaProperty", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getNodeFactory", ""}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getParser", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "deserializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:10>", "<s:kke>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findClass", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_calcName", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "createInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:0>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "instantiationException", "java.lang.Class,java.lang.String", "<sample:1>", "13E-5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"\r1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\r1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportUnknownProperty", new String[]{"java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<s:>", "a c", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "constructType", "java.lang.reflect.Type", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdStringException", new String[]{"java.lang.String", "java.lang.Class", "java.lang.String"}, new String[]{"1.1234567890123456a b", "<sample:3>", "01013E-5"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", new String[]{"java.lang.String"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '10'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=10, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "leaseObjectBuffer", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ObjectBuffer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "constructType", "java.lang.reflect.Type", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "createInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:5>", "<sample:7>", "<sample:4>"}, false, 6, new String[][]{}), new String[][]{{"createInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.InjectableValues", "1"}, {"handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<s:>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_calcName", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findClass", new String[]{"java.lang.String"}, new String[]{"-"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "leaseObjectBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getTimeZone", ""}}), new String[][]{{"completeAndClearBuffer", "java.lang.Object[],int,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"5/"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}}), new String[][]{{"assignIndex", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '5/'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=5/, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<null>"}}), new String[][]{{"getMember", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", "java.lang.Object,java.lang.Object", "<s:b>", "<s:a>"}}), new String[][]{{"hasViews", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "keyDeserializerInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<s:k>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getWrapperName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_valueDesc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[N/A]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getDateFormat", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getParser", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getContextAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getActiveView", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", ""}, {"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAttribute", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findInjectableValue", "java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object", "<i:-2>", "<sample:0>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "with", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "<sample:4>"}}), new String[][]{{"resolve", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:-65>", "<sample:6>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", actual.getClass().getName());
  assertEquals("{hasReferringProperties=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:-1>", "<sample:3>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findRootValueDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ReadableObjectId", actual.getClass().getName());
  assertEquals("{hasReferringProperties=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasDeserializationFeatures", new String[]{"int"}, new String[]{"33"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getContextualType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "\\1,12]", "\\1,]1.5f"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Could not resolve type id '\\1,12]' into a subtype of [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]: \\1,]1.5f {...#556#1409147107", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getConfig", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1L\t"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property '1L\t'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=1L\t, getPropertyIndex=0, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=!NullPointer...#210#-1629711745", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getLocale", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false), new String[][]{{"getDoubleBuilder", "", "5"}, {"appendCompletedChunk", "java.lang.Object,int", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not deserialize instance of java.lang.Object out of VALUE_NUMBER_INT token {getLocalizedMessage=Can not deserialize instance of java.lang.Objec...#489#1862607468", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.util.concurrent.atomic.AtomicReference"}, new String[]{"<sample:2>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findRootValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getFactory", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<i:1>", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getBase64Variant", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "determineClassName", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"2b"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdNumberException", "java.lang.Class,java.lang.String", "<sample:3>", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "determineClassName", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "readPropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:6>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMember", ""}}), new String[][]{{"getContextAnnotation", "java.lang.Class", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_calcName", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findNonContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "determineClassName", new String[]{"java.lang.Object"}, new String[]{"<d:-525.0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findClass", "java.lang.String", "03E"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Double", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "copy", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"weirdStringException", "java.lang.Class,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructType", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, isAbstract=true, isArrayType=false, isCollectionLikeType=false, isC...#345#-2039533746", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "constructCalendar", "java.util.Date", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "checkUnresolvedObjectId", ""}}), new String[][]{{"getLocation", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "canOverrideAccessModifiers", ""}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:9>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "constructType", "java.lang.reflect.Type", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "returnObjectBuffer", new String[]{"com.fasterxml.jackson.databind.util.ObjectBuffer"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getParser", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "createInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.InjectableValues"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, false, 5, new String[][]{}), new String[][]{{"weirdStringException", "java.lang.Class,java.lang.String", "1"}, {"getPathReference", "java.lang.StringBuilder", "2"}, {"insert", "int,double", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class"}, new String[]{"<null>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "endOfInputException", "java.lang.Class", "<sample:0>"}}), new String[][]{{"getByteBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$ByteBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "set", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<s:j>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}1.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getArrayBuilders", ""}}), new String[][]{{"getMessage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getFactory", new String[]{}, new String[]{}, false), new String[][]{{"findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"1.12345678801244567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678801244567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:46>", "<sample:4>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<sample:4>", "<sample:0>"}}), new String[][]{{"getKey", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "instantiationException", new String[]{"java.lang.Class", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of java.lang.String, problem: null {getLocalizedMessage=Can not construct instance of java.lang.String, problem: nul.., ...#472#-983453220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "determineClassName", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>", "<sample:3>"}, false), new String[][]{{"getPathReference", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdStringException", new String[]{"java.lang.String", "java.lang.Class", "java.lang.String"}, new String[]{"0x12345678=abc", "<sample:6>", "2020-02-30T25:61:61"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getContextualType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a} {getNamespace=a, getSimpleName=, hasNamespace=true, hasSimpleName=false, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{"a b"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", actual.getClass().getName());
  assertEquals("[property 'a b'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=a b, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findInjectableValue", "java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object", "<s:0\"ke>", "<sample:5>", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "unknownTypeException", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:4>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<s:1a>", "<sample:9>", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findRootValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{"5_.\u00e9"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 5_.\u00e9 {getLocalizedMessage=5_.\u00e9, getMessage=5_.\u00e9, getOriginalMessage=5_.\u00e9, getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMapp...#241#1045260150", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getObjectIdInfo", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_calcName", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "readPropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.MapperFeature"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"0xF<FFFFFFFa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_valueDesc", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xF<FFFFFFFa", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdStringException", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:1>", "."}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<s:>", "<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "deserializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:9>", "<b:true>"}}), new String[][]{{"hasReferringProperties", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getPropertyIndex", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", "java.lang.Class[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=true, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.String", "\n"}}), new String[][]{{"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "readPropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getDateFormat", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false), new String[][]{{"simpleAsEncoded", "com.fasterxml.jackson.databind.cfg.MapperConfig", "1"}, {"appendUnquoted", "char[],int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "canOverrideAccessModifiers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdNumberException", "java.lang.Class,java.lang.String", "<sample:5>", "ull"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:2>"}, false), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdNumberException", new String[]{"java.lang.Number", "java.lang.Class", "java.lang.String"}, new String[]{"<i:-1>", "<sample:3>", "0101.5dnull"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getContextualType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false), new String[][]{{"hasSimpleName", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[property '']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getBase64Variant", ""}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "checkUnresolvedObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getParser", ""}}), new String[][]{{"getFloatBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:2>", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdNumberException", new String[]{"java.lang.Number", "java.lang.Class", "java.lang.String"}, new String[]{"<d:49.5>", "<sample:1>", ".5"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getMetadata", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "{\"a\":1}1.1234567"}}), new String[][]{{"withDescription", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyMetadata", actual.getClass().getName());
  assertEquals("{getDefaultValue=a, getDescription=, getIndex=5, getRequired=false, hasDefaultValue=true, hasDefuaultValue=true, hasIndex=true, isRequired=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "leaseObjectBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:5>"}}), new String[][]{{"completeAndClearBuffer", "java.lang.Object[],int", "5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Object;", actual.getClass().getName());
  assertEquals("[, true, c]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false), new String[][]{{"getSimpleName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "readValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", new String[]{"java.lang.Exception", "java.lang.Object"}, new String[]{"<sample:4>", "<d:7.300000000000001>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getDeclaringClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getContextualType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "with", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<sample:3>"}}), new String[][]{{"withSimpleName", "java.lang.String", "1"}, {"simpleAsEncoded", "com.fasterxml.jackson.databind.cfg.MapperConfig", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("a {getValue=a}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "0y1F", "trve"}, false, 7, new String[][]{}), new String[][]{{"getPathReference", "java.lang.StringBuilder", "6"}, {"append", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("samplesample", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "checkUnresolvedObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "copy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:1>", "http://example.com/a?b=c"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "_calcName", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{" 010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "setAttribute", "java.lang.Object,java.lang.Object", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdGeneratorInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:4>", "<sample:1>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<i:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getTypeFactory", ""}}), new String[][]{{"resolve", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "checkUnresolvedObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<i:-2147483624>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "deserializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:0>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:1>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findKeyDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:5>"}}), new String[][]{{"getPath", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"TIT,KE"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", "java.lang.Object,java.lang.Object", "<i:-2>", "<s:o>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{".0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "setAttribute", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:k>", "<d:-15.0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "copy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getActiveView", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<sample:0>", "<sample:4>"}}), new String[][]{{"getBooleanBuilder", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<s:b>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "returnObjectBuffer", "com.fasterxml.jackson.databind.util.ObjectBuffer", "<sample:6>"}}), new String[][]{{"hasReferringProperties", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<s:=ey>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:3>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "createInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.InjectableValues", "<sample:6>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasViews", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getBooleanBuilder", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$BooleanBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdKeyException", new String[]{"java.lang.Class", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1/5", "a,b,c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setManagedReferenceName", new String[]{"java.lang.String"}, new String[]{"2157483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "_throwAsIOE", "java.lang.Exception", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=2157483648, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:10>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "leaseObjectBuffer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:-22>", "<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<s:>", "<sample:3>"}}), new String[][]{{"referringProperties", "", "0"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getNodeFactory", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_desc", new String[]{"java.lang.String"}, new String[]{"a b1.1234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getArrayBuilders", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "getContextualType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-2093806568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "canOverrideAccessModifiers", ""}}), new String[][]{{"containedTypeCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "instantiationException", "java.lang.Class,java.lang.String", "<sample:2>", "1E-5"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:0>", "<sample:7>"}}), new String[][]{{"getDelegatee", "", "7"}, {"getNullValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "instantiationException", "java.lang.Class,java.lang.Throwable", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<s:l>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator,com.fasterxml.jackson.annotation.ObjectIdResolver", "<s:key>", "<sample:0>", "<sample:7>"}}), new String[][]{{"appendReferring", "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring", "2"}, {"hasReferringProperties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{".26"}, false), new String[][]{{"getPathReference", "java.lang.StringBuilder", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "copy", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"unknownTypeException", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Could not resolve type id 'a' into a subtype of [simple type, class java.lang.Object] {getLocalizedMessage=Could not resolve type id 'a' into a sub...#496#-2138830850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "endOfInputException", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.JsonDeserializer", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:8>", "<s:b>", "\\1\u00e92]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getFactory", new String[]{}, new String[]{}, false), new String[][]{{"createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, false, 4, new String[][]{}), new String[][]{{"isCollectionLikeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "_valueDesc", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[N/A]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator", "com.fasterxml.jackson.annotation.ObjectIdResolver"}, new String[]{"<i:17>", "<sample:5>", "<sample:4>"}, false), new String[][]{{"referringProperties", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructCalendar", new String[]{"java.util.Date"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "weirdStringException", "java.lang.Class,java.lang.String", "<sample:0>", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.util.GregorianCalendar", actual.getClass().getName());
  assertEquals("java.util.GregorianCalendar[time=-2103616372000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastR...#656#1685278853", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:4>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getManagedReferenceName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:6>"}}), new String[][]{{"getMessage", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Can not deserialize instance of generated.algorithm.SearchInputFactory_scaffolding$GenericSub out of FIELD_NAME token", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "instantiationException", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:1>", "2020-/2-30T25:61:61abc"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Can not construct instance of generated.algorithm.SearchInputFactory_scaffolding$GenericSub, problem: 2020-/2-30T25:61:61abc {getLocalizedMessage=C...#535#580615836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setAndReturn", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:4>", "<i:2147483647>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "keyDeserializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:1>", "<i:-524284>"}}), new String[][]{{"getNullValue", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.DeserializationFeature", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "readValue", "com.fasterxml.jackson.core.JsonParser,java.lang.Class", "<sample:7>", "<null>"}}), new String[][]{{"getLongBuilder", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$LongBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.annotation.ObjectIdGenerator"}, new String[]{"<i:-22>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "findContextualValueDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:5>"}}), new String[][]{{"referringProperties", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "toString", ""}}), new String[][]{{"hasNamespace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getFullName", new String[]{}, new String[]{}, false), new String[][]{{"withSimpleName", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{a}sample {getNamespace=a, getSimpleName=sample, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setViews", new String[]{"java.lang.Class[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getValueDeserializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=true, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getNodeFactory", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"numberNode", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.IntNode", actual.getClass().getName());
  assertEquals("-128 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, is...#311#1857001581", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false), new String[][]{{"getShortBuilder", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "objectIdResolverInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getArrayBuilders", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "mappingException", "java.lang.Class", "<sample:1>"}}), new String[][]{{"getBooleanBuilder", "", "2"}, {"_constructArray", "int", "6"}});
  assertNotNull(actual);
  assertEquals("[Z", actual.getClass().getName());
  assertEquals("[false, false, false]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "unknownTypeException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1.5e300--1", "--1"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "checkUnresolvedObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "hasValueTypeDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "visibleInView", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "getCreatorIndex", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[property ''] {getCreatorIndex=-1, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty", "withName", "java.lang.String", "nnull"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[property 'sample'] {getCreatorIndex=-1, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false, isRequired=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "with", new String[]{"com.fasterxml.jackson.databind.deser.DeserializerFactory"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", actual.getClass().getName());
  assertEquals("{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handlePrimaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
}
