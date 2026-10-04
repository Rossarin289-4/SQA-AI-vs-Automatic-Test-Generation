package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "resolve", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<i:-2147483648>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:6>", "<sample:2>", "<i:-1>", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:7>", "<i:-2147483648>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<empty>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getBeanClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:3>", "<s:a>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:6>", "<sample:6>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasVi...#244#-1438549395", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<null>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "creatorProperties", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "1.25", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:5>", "2147483648", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "int", "-3"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", ""}}, 2), new String[][]{{"findInjectableValue", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withIgnorableProperties", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "injectValues", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<i:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:7>", ")", "<i:-2>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:2>", "<sample:4>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>", "1.12345678", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:0>", "<b:true>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.25", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:2>", "<s:>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "<s:>", "+1.1.5dgtto://exampld.c)om/`?b=b\n] (forD 2020-01-01"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:0>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}}, 3), new String[][]{{"getContextAnnotation", "java.lang.Class", "1"}, {"annotationType", "", "5"}, {"annotationType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<empty>", "<s:Mam>", "-2147483648", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "122.1233671E;-5"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "java.lang.String", "'] (for "}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:4>", "<i:2>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<i:0>", "62", "<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "java.lang.String", "'] goD)"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<i:-2>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isIntNumber", "java.lang.String", " a>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isIntNumber", "java.lang.String", "http://example.com/a?b=c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<i:-2147483648>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<empty>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:7>", "<i:-2147483648>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<empty>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"a b\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:3>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "properties", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<null>", "<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:3>", "<sample:6>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<null>", "<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:3>", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:3>", "<s:b>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:6>", "<sample:3>", "<i:0>", "-2147483648", "0"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:1>", "<sample:0>", "2147483647", "true"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:6>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:4>", "<s:>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:6>", "<sample:3>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<null>", "<s:||{>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:12>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:5>", "0x1F", "<i:-2147483648>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=a,shape=NUMBER_FLOAT,locale=sample,timezone=null] {getPattern=a, getShape=NUMBER_FLOAT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>", "<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=NUMBER,locale=sample,timezone=null] {getPattern=, getShape=NUMBER, hasLocale=true, hasPattern=false, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:3>"}}, 1), new String[][]{{"withLocale", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=NUMBER_INT,locale=a,timezone=a] {getPattern=0, getShape=NUMBER_INT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:12>", "<sample:6>", "<s:||{>", "1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:0>", "<i:-2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "creatorProperties", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:1>", "0", " "}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:12>", "<sample:0>", "0x123456789", "<s:||{>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:0>"}}, 3), new String[][]{{"getCreatorIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:0>"}}, 3), new String[][]{{"getCreatorIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false,...#235#1408172214", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:0>"}}, 3), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:7>", "<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<i:2>", "0", "<sample:3>"}}, 3), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isPosInf", "java.lang.String", "a,b,c"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:9>", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false,...#235#1594351994", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isPosInf", "java.lang.String", "a,b,c"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:9>", "<sample:0>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasVi...#244#-1438549395", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "resolve", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueInstantiator", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueInstantiator", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:7>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueInstantiator", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:1>", "true", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:5>", "<null>", "http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getBeanClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:4>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<sample:0>", "<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<s:c>", " 12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:2>", "<sample:3>", "<b:true>", "{\"a\":1}"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"&", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", ")."}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "creatorProperties", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:1>", "<sample:4>", "<i:-2147483648>", "<i:-2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueInstantiator", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "1.25"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasVi...#244#-2137291855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "1.25"}}, 1), new String[][]{{"hasViews", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:2>", "<sample:0>", "<s:a>", "1.5e300"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isCachable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<s:b>", "1.5d", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<i:-2>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isIntNumber", "java.lang.String", " a>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isIntNumber", "java.lang.String", "http://example.com/a?b=c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:5>", "<i:-2147483648>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:2>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<empty>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<i:-2147483648>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<empty>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isPosInf", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"a b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:3>", "<i:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:4>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:3>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:3>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_hasTextualNull", "java.lang.String", "] (for "}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=a,shape=NUMBER_FLOAT,locale=sample,timezone=null] {getPattern=a, getShape=NUMBER_FLOAT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:3>"}}), new String[][]{{"withLocale", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=NUMBER_INT,locale=a,timezone=a] {getPattern=0, getShape=NUMBER_INT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:3>"}}), new String[][]{{"withLocale", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=a,timezone=null] {getPattern=, getShape=ANY, hasLocale=true, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:6>", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:4>"}}), new String[][]{{"withLocale", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=STRING,locale=a,timezone=null] {getPattern=sample, getShape=STRING, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>", "0", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<null>"}}), new String[][]{{"hasPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<i:-1>", "\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:5>", "<sample:1>", "<s:>", "1", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_hasTextualNull", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:6>", "<s:a>", "1", "1.1234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:6>", "<sample:4>", "<b:true>", "2", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:5>", "<null>", "<d:1.5>", "-1.5"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", ")"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isIntNumber", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>", "2147483647", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:12>", "<sample:0>", "<s:>", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getBeanClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "0x1F"}}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<i:2>", "010", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "asArrayDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:0>", "<sample:5>", "<d:1.5>", "#temporary-name"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:1>", "<sample:7>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:7>", "<sample:6>", "<b:true>", "<i:-2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getBeanClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "int", "2"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "asArrayDeserializer", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNegInf", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNegInf", "java.lang.String", ")."}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:0>"}}), new String[][]{{"getCreatorIndex", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:7>", "<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<i:2>", "0", "<sample:3>"}}), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"Hello, World", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false,...#235#1594351994", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}}), new String[][]{{"findInjectableValue", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:3>", "<null>", "<s:>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<null>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:0>", "<i:0>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveUnwrappedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "<sample:1>", "1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:1>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:2>", "<sample:4>", "<sample:6>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<i:-2147483648>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:7>", ")", "<i:-2>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:2>", "<sample:4>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<i:-2147483609>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:7>", ")", "<i:-2>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:2>", "<sample:4>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483609", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:0>", "<sample:4>", "<s:||{>", "--1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:5>", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:1>", "true", "<d:1.5>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:4>", "<i:1>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<s:key>", "2", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "injectValues", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isIntNumber", "java.lang.String", "1L"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<i:-2>", "1", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:2>", "<d:1.5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:0>", "<s:b>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\u00e9", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:1>", "<null>", "<s:>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<b:true>", "0", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}}), new String[][]{{"deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<i:-1>", "null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:12>", "<sample:5>", "<s:a>", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:6>", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:6>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:6>"}}), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "4"}, {"hasPattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:1>", "2147483648", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}), new String[][]{{"getLocale", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:6>", "<sample:4>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getBeanClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "1.12345678901234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<s:||{>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:5>", "<sample:5>", "<s:key>", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("||{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withIgnorableProperties", "java.util.Set", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>", "[1,2]", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "asArrayDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:12>", "<sample:4>", "<i:2>", "-2147483648", "1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:12>", "<sample:1>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{")"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<d:1.5>", "1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:4>", "<null>", "<sample:1>"}}), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:1>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:4>", "<null>", "<sample:1>"}}), new String[][]{{"findFormatOverrides", "com.fasterxml.jackson.databind.AnnotationIntrospector", "7"}, {"hasPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<null>", "<sample:3>", "<i:-1>", "PT1H"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isPosInf", "java.lang.String", "2147483748"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasVi...#244#-2137291855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<i:-2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:2>", "<b:true>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "#temporary-name1.1234567890123_56"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "java.lang.String", "\t"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:6>", "<sample:2>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<i:-2147483648>", "1", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:4>"}, false), new String[][]{{"findBackReference", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"5."}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<b:true>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>", "<s:>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<null>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<b:true>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<s:>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<i:0>", "0", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"-3"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:7>", "<i:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<i:2>", "': back reference type (", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:7>", "<i:-2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>", "<s:key>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<s:key>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<i:-17>", "s0\tFFFFFFFF", "<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNaN", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<i:2>", "0", "'"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "<i:2>", "2147483647", "'"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:12>", "<sample:2>", "2", "--1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:3>", ".5", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:9>", "<sample:2>", "8194", "--1"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:3>", " ", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false), new String[][]{{"getDelegatee", "", "0"}, {"creatorProperties", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"f_11X+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:5>", "<sample:0>", "<i:-2147483648>", "21474836)8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<s:>", "PT1"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNegInf", "java.lang.String", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:12>", "<sample:7>", "<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<sample:11>", "<s:x>", "+1.1.5dhttp://exampld.c)om/`?b=c\n"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNegInf", "java.lang.String", "5."}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:4>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<null>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "<sample:0>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:7>", "<null>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
