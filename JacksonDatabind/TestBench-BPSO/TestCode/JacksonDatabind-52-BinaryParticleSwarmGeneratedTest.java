package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromNumber", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withIgnorableProperties", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<i:49>", "-1.5"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:0>", "<b:true>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "com.fasterxml.jackson.databind.PropertyName", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>", "21474836", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:7>", "<s:A>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "12f:30:45+0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:11>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "java.lang.String", "--0"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "injectValues", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<i:-8388609>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "resolve", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:10>", "2020-02-30T25:61:61", "<i:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:8>", "<sample:3>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:6>", "<sample:0>", "<b:false>", "2147483647", ": value instantibtor ("}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<null>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNaN", "java.lang.String", "1.12345679901234561.1234567890123456"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:9>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<s:krey>", "34", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:9>", "<s:jey>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "y,b,c"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:6>", "<sample:10>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:9>", "5", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:4>", "<a>b</a>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:1>", "<sample:11>", "<sample:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:8>", "<s:>", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.util.concurrent.atomic.AtomicBoolean", actual.getClass().getName());
  assertEquals("false {get=false, getAcquire=false, getOpaque=false, getPlain=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:10>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:10>"}}), new String[][]{{"inject", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:15>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:15>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNaN", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:6>", "<s:+b>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:14>", "<sample:3>", "<i:2>", "PT1"}}, 3), new String[][]{{"withLocale", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=STRING,locale=,timezone=null] {getPattern=sample, getShape=STRING, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<i:1>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<d:3.4200000000000004>", "-1", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "creatorProperties", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}}), new String[][]{{"getType", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<b:false>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:4>", "<sample:0>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<d:2.88>", "123F456789012345678901234567890", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:5>", "<sample:1>", "<i:49>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withObjectIdReader", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:9>", "<s:'>", "17", "T.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<i:0>", "2048", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:10>", "<sample:6>", "<d:14.4>", "1.1234567890123456"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "<a>b</a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloat", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:11>", "<sample:5>", "<i:1>", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"1.123456789012345672020-02-30T25:61:61"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseIntPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<empty>", "<s:bp>", "-1", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<s:by>", "#temporary-name", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:2>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:11>", "<s:key>", "a b"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:2>", "<sample:11>", "<sample:6>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "1.123457678", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:5>", "] (foP ", "<d:3.6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<s:6aa>", "-2147483648", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"0xFFFxEFFF"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"01123456789"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<a>o</a>1.5e300", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:8>", "<i:75>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:3>", "<s:<ey>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:10>", "<i:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "properties", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "<sample:4>", "2021-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:0>", "<i:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<null>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"start", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "<sample:3>", "a>b</a>", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:7>", "<d:1.5599999999999996>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getKnownPropertyNames", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:11>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:10>", "<sample:4>", "<s: a>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withIgnorableProperties", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:10>", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"aa b"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:7>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:10>", "<sample:15>", "36", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:12>", "<sample:11>", "<b:false>", "1", "1.5e3001.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<null>", "<sample:10>", "<d:7.2>", "1.6f1.1234567890123456"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:4>", "<sample:3>", "<sample:2>"}}, 2), new String[][]{{"getKnownPropertyNames", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "asArrayDeserializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withIgnorableProperties", "java.util.Set", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:11>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveUnwrappedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"5/-1.5"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"\u00e9."}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "12f:30:44+1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShort", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"a c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseInteger", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:8>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownVanilla", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:8>", "<sample:8>", "<sample:1>", "2020-02-30T25:61:61a b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"48"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:5>", "#temporary-name", "<b:false>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:8>", "+I", "<d:7.2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:10>", "<sample:2>", "<d:2.88>", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveUnwrappedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:9>", "<s:c>", "<d:7.2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getBeanClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:5>", "<sample:1>", "<null>", "-1", "a c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<sample:7>", "0xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<empty>", "<d:2.88>", "2147483647", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:8>", "<sample:8>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:1>", "<sample:5>", "91.5", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1L<a>bv/a>", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "resolve", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<i:0>", "<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseByte", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{",0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:5>", "<d:-1.5>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:4>", "<sample:4>", "<b:false>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloat", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getObjectIdReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<i:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "`b", "<i:-2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"0Class "}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:4>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:10>", "<sample:11>", "<d:2.88>", "2", "#temporLary-name"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "withIgnorableProperties", "java.util.Set", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,int,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<d:1.17>", "0", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:11>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handlePolymorphic", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>", "<null>", "<i:-2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<null>", "<sample:11>", "<sample:0>", "http://example.cPom/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "12f:30:45+1", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<b:true>", ": value instantiator (5.", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<s:kex>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<i:-17>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "creatorProperties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"-1\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getBeanClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:11>", "<sample:6>", "<sample:2>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "properties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:8>", "<s:>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:3>", "<sample:3>", "<sample:2>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:2>", "<d:-7.2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:10>", "<sample:10>", "<sample:1>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<b:false>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:4>", "<i:-134217660>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134217660", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"00", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:3>", "<d:2.88>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.88", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:9>", "<sample:2>", "<i:30>", "eL010"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<null>", "<d:-1.5200000000000005>", "2/20-02-30T25:61:61a b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:3>", "<sample:4>", "<null>", "<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<s:a>", ").I", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasVi...#244#-2137291855", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1925"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1925.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNaN", "java.lang.String", "-5"}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:8>", "2", ",I"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getBeanClass", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:13>", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getObjectIdReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveManagedReferenceProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"a,,c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "<sample:10>", "ab-"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:9>", "<sample:5>", "8", "#temporarx-name"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:11>", "<sample:10>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:2>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=STRING,locale=0,timezone=null] {getPattern=sample, getShape=STRING, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "creatorProperties", ""}}), new String[][]{{"properties", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:4>", "<sample:0>", "<d:7.2>", "] (fr "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isPosInf", "java.lang.String", "{\"a\":1})."}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:13>", "<b:false>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:5>", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:11>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'a'; inject id 'true'] {getCreatorIndex=64, getManagedReferenceName=null, getName=a, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=fa...#238#292281689", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "asArrayDeserializer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<sample:7>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:10>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false,...#235#1408172214", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueInstantiator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "1.5Td#temporary-name"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "isCachable", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:7>", "<d:-6.300000000000001>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getValueType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_deserializeFromEmpty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:7>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getObjectIdReader", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseInteger", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:8>"}}), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:10>", "<sample:3>", "<d:7.2>", "[1,2]"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"00", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:7>", "<s:A>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:10>", "<sample:3>", "", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"1-12345678"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseLong", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:10>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:12>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:2>", "<empty>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:10>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1-5d", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:11>", "<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"getPropertyIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getBeanClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_findSubclassDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<d:-0.6300000000000001>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:11>", "<sample:0>", "<d:-7.2>", "\010"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "wrapAndThrow", "java.lang.Throwable,java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<s:>", "123F456789012345678901234567890", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:1>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getNullValue", ""}}, 1), new String[][]{{"deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:12>", "<sample:8>", "<i:4>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>", "<sample:4>", "<sample:5>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:5>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<d:2.88>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:7>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.88", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:11>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:15>", "<sample:11>", "<s:>", "<s:b>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "replaceProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<b:false>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:3>"}}, 2), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:9>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:5>", "<sample:5>", "<i:8388609>", "<d:1.5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveUnwrappedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:5>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:11>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isNegInf", "java.lang.String", "\n0xFFFFFFFF"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<d:-2.88>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasProperty", "java.lang.String", "12:3045"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"55"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "a,"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromObjectUsingNonDefault", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:13>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:4>", "<d:-5.7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "java.lang.String", "1.5e"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}, 3), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_isPosInf", "java.lang.String", "1:5d"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromEmbedded", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:13>", "<sample:11>", "<s: >"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findBackReference", "java.lang.String", "a b1.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<d:-8.0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:0>", "<sample:1>", "<i:0>", "-2147483648", "true:"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:12>", "<sample:7>", "<s:{>", "0", "1ou5"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:4>", "<sample:4>", "4", "PU1H"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:6>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseByte", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:9>", "<sample:4>", "<sample:6>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:7>", "#temporLary-name0", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "hasViews", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "handleIgnoredProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:1>", "<sample:6>", "<d:1.79>", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "properties", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:8>", "<i:2>", "<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLong", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getKnownPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "asArrayDeserializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:11>", "<sample:3>", "<sample:0>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:8>", "<d:-1.7000000000000002>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseBooleanFromOther", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "getPropertyCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeFromBoolean", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"Class "}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_parseShortPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "int", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>", "32", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "findProperty", "java.lang.String", "2M"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "deserializeWithObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:11>", "<sample:6>"}}), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
}
