package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<s:Pna>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:5>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isCachable", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:0>", "<null>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueInstantiator", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>", "<sample:0>", "<b:true>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<sample:4>", "<b:true>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<sample:3>", "<b:false>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "\nHello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", "java.lang.String", "I"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "\nHello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", "java.lang.String", "I"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<null>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShort", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:11>", "<sample:5>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", "java.lang.String", "II"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:7>", "<s:a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<null>", "<sample:7>", "<s:a>", "--1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "<s:b>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:6>", "<b:true>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:8>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<b:true>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>", "<i:-1>", "<sample:9>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:0>", "<sample:7>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"["}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getBeanClass", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>", "<i:0>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<b:false>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<s:>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<s:llc>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<sample:1>", "<s:key>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("llc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNaN", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:0>", "<sample:7>", "<i:-1>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "properties", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 41, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isCachable", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "resolve", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<null>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:1>", "<sample:0>", "<sample:4>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:11>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<b:true>", "H4", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"1"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:2>", "<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", "java.lang.String", ">"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:2>", "<s:cd>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", "java.lang.String", "??"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:3>", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:5>", "<s:a>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", "java.lang.String", "5-"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>", "<s:a>", "<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", "java.lang.String", "5-"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>", "0", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasViews", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasVi...#244#-2137291855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasProperty", "java.lang.String", "http://example.com/a?b=c"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:10>", "<sample:4>", "<s::b>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:10>", "<sample:4>", "<s::b>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:4>", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<s:Pna>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:4>", "<b:false>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:3>", "<s:P>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:6>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:7>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "java.lang.String", "1.1234567c890123456"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:6>", "<sample:4>", "<s:key>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>", "<i:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<null>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<s:9z>", "a b", "<sample:6>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveUnwrappedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>", "<b:true>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>", "0x1F", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", "java.lang.String", "-1.6"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNegInf", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveManagedReferenceProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"12:30:45", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<s:b>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>", "<sample:0>", "<b:true>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "properties", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<s:b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<i:1>", "-2147483648", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:5>", "<b:false>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<i:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<s:b>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "<i:0>", "010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>", "<i:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "resolve", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isPosInf", "java.lang.String", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isCachable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getBeanClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"12:30:45", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:4>", "<s:b>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "properties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getBeanClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:7>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false,...#235#1594351994", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{")"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>", "<b:false>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>", "<s:key>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>", "<s:kery>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kery", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>", "<s:b>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>", "<i:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>", "<s:key>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false), new String[][]{{"findProperty", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}), new String[][]{{"findProperty", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isPosInf", "java.lang.String", "1e10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<sample:1>", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:5>", "<i:-1>", "1.12345678901234567"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<s:key>", "1.1234567", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isCachable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<b:true>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:a>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<s:>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<s:>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<s:\u00e9>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanFromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<s:>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<s:e>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanFromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<s:>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<s:d>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanFromInt", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<null>", "<s:>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:2>", "<d:1.5>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNaN", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:1>", "<sample:7>", "<i:-1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>", "<s:>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "properties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<null>", "<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>", "<sample:8>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>", "0", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:6>", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<sample:4>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_hasTextualNull", "java.lang.String", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handledType", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withObjectIdReader", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:3>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<b:true>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<null>", "<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"5."}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasVi...#244#-2137291855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<b:false>", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNaN", "java.lang.String", "/.5"}}), new String[][]{{"withName", "java.lang.String", "1"}, {"getAnnotation", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveUnwrappedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_hasTextualNull", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<s:a{>", "b", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<s:Pna>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:6>", "<sample:2>", "<s:a>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<s:Pna>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:6>", "<sample:2>", "<s:I>", "<null>"}}), new String[][]{{"deserializeSetAndReturn", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:7>"}, false), new String[][]{{"deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:3>"}, false), new String[][]{{"hasViews", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<s:b>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<s:b>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:5>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:4>", "<s:Pna>", "1.12345678901234567"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<i:-51>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<i:51>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "java.lang.String", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:5>", "<sample:3>", "<d:1.5>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasProperty", "java.lang.String", "W"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{".1234l688", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handledType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", "java.lang.String", "Hekmo, Woldd"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:Pna>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"\nHello, World"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"\nHello,\037World)"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2345678901234568E29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"2e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasViews", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getObjectIdReader", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withIgnorableProperties", "java.util.Set", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getBeanClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withIgnorableProperties", "java.util.Set", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getBeanClass", ""}}, 3), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withIgnorableProperties", "java.util.Set", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getBeanClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:7>", "<sample:4>", "<s:a>", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Hello, World", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:4>", "<sample:6>", "<b:false>", "a,b,c"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<b:true>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "creatorProperties", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:7>", "<sample:5>", "<s:key>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<null>", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<null>", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<s:kPy>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kPy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<s:lPy>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lPy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<null>"}}), new String[][]{{"setManagedReferenceName", "java.lang.String", "2"}, {"getInjectableValueId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<s:kQy>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kQy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:6>", "<s:kQz>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kQz", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:2>", "<s:kQ>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kQ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:6>", "<i:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:2>"}, false), new String[][]{{"isRequired", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:6>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:6>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:9>", "<sample:6>", "<i:1>", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:9>", "<sample:6>", "<i:1>", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:9>", "<sample:5>", "<i:1>", "1.1234567"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:8>", "<i:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:9>", "<sample:5>", "<i:1>", "1.1234567"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<sample:6>", "<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<null>", "<sample:5>", "<s:key>", "+1"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<i:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:3>", "<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withIgnorableProperties", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveManagedReferenceProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:5>", "<sample:4>", "<null>", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "<b:true>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getKnownPropertyNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<b:true>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", ""}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getKnownPropertyNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<b:false>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getKnownPropertyNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:5>", "<s:a5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<sample:5>"}, false), new String[][]{{"getValueDeserializer", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<i:1>", "-2147483648", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isPosInf", "java.lang.String", "2147483648"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"\u00eb12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findBackReference", "java.lang.String", "TITLE"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<sample:6>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:6>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<null>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:6>", "<s:;PPP>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<s:;PPP>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:0>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";PPP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "<s:;;PPP>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";;PPP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "<s:;;PP>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:0>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";;PP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<b:true>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:1>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=fal...#238#-1831401486", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "withIgnorableProperties", "java.util.Set", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "deserializeFromDouble", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:0>", "<b:true>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveManagedReferenceProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer", "finishBuild", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:Pna>"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pna", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
