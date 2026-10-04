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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeWithErrorWrapping", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_creatorReturnedNullException", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeWithErrorWrapping", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:12>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:0>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:9>", "<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_replaceProperty", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:0>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>", "<sample:7>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:8>", "<s:?>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:7>", "<sample:2>", "<i:1>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<null>"}, false), new String[][]{{"withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "1"}, {"getValueClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_creatorReturnedNullException", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_creatorReturnedNullException", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.NullPointerException", actual.getClass().getName());
  assertEquals("java.lang.NullPointerException: JSON Creator returned null {getLocalizedMessage=JSON Creator returned null, getMessage=JSON Creator returned null, getStackTrace=[com.fasterxml.jackson.databind.deser.B...#242#833663937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:8>", "j"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "true"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findPropertyUnwrapper", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:7>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_intOverflow", "long", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:1>", "<i:-1>", "[[1,2]"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:1>", "false"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:8>", "<i:-10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"+c"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:5>", "0x12345\t789"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findPropertyUnwrapper", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"1.a4"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<i:-2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", "java.lang.String", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<s:ra>", "/a/b1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:7>", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:9>", "<sample:3>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:3>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:3>", "<sample:3>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, hasViews=false,...#253#-2095528534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:3>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Hello,!Worlda"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"-2.:"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:6>", "<sample:8>", "<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<i:2>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:9>", "<i:0>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findValueNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata", "<sample:1>", "<sample:5>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findPropertyUnwrapper", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<sample:2>", "<empty>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"2E47483648"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:8>", "<sample:4>", "<s:ke>", "2020-02-30T25:61:61TITLE"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1ne0"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:10>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_intOverflow", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyAccessPattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:6>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findPropertyUnwrapper", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:6>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>", "<null>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:6>", "<sample:6>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findPropertyUnwrapper", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:14>", "<sample:6>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"1073479683"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:10>", "<sample:6>", "<sample:0>", "<sample:4>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_missingToken", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeWithErrorWrapping", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:6>", "<sample:10>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:2>", "<sample:9>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"-:1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:13>", "<sample:1>", "-1"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "0x12346789"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:10>", "<sample:0>", "2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "<sample:4>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"P0H"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>", "<i:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:4>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findBackReference", new String[]{"java.lang.String"}, new String[]{"a-b,c"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithType", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer"}, new String[]{"<sample:4>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:1>", "<s:k\u00e9ey>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeWithErrorWrapping", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:1>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:2>", "<d:12.600000000000001>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findValueNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata", "<sample:5>", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseShortPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", new String[]{"java.lang.String"}, new String[]{"\t{8\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:0.95>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.95", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "iPT1H"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handlePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<sample:10>", "<i:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", "java.lang.String", "1.5;"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:9>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findPropertyUnwrapper", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"java.lang.String"}, new String[]{"A1.25"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isIntNumber", "java.lang.String", "I0x123456789"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "<sample:1>", "2020-01-015."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:6>", "<i:-1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", "int", "2146959359"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<null>", "<s:}>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getBeanClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceNullToken", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:5>", "false"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:8>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<sample:1>", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "ab"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getKnownPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_replaceProperty", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap,com.fasterxml.jackson.databind.deser.SettableBeanProperty[],com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:1>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>", "<sample:10>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:10>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleIgnoredProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:4>", "<i:-1>", "-1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeUsingPropertyBased", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:9>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:1>", "<i:-131070>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1E-51.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getDelegatee", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromString", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Class", "<sample:1>", "<sample:0>", "<s:key>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"-43"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isIntNumber", new String[]{"java.lang.String"}, new String[]{"I."}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"1.2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isEmptyOrTextualNull", new String[]{"java.lang.String"}, new String[]{"\n<i"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "parseDouble", new String[]{"java.lang.String"}, new String[]{"null"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNumber", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:4>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "a\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownVanilla", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:7>", "<d:1.5>", "0"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:6>", "<s:{>", "<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:0>", "<s:a>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNegInf", "java.lang.String", "a,b,ctrue"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>", "<b:true>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<i:-30>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveMergeAndNullSettings", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata", "<sample:3>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_reportFailedNullCoerce", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean", "java.lang.Enum", "java.lang.String"}, new String[]{"<sample:0>", "true", "<sample:1>", "H\n"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_missingToken", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:5>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:7>", "<sample:1>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperty", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.String", "<sample:6>", "<sample:6>", "<s:II>", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "1.5ftrue"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>", "<i:0>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<null>", "<sample:3>", "<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitive", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("SKIP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"int"}, new String[]{"-59"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<s:a>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.KeyDeserializer"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullAccessPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("ALWAYS_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeWrappedValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:12>", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("AS_EMPTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", "java.lang.String", "110PT1H"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("FAIL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "properties", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromDouble", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:15>", "<s:b>", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "12:30:45-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:12>", "-1X5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.Nulls", actual.getClass().getName());
  assertEquals("SET", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceEmptyString", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", "java.lang.String", "/a9/b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveMergeAndNullSettings", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:2>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1234567890122345678901234567890", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_replaceProperty", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:2>", "<sample:6>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:10>", "<null>", "<d:1.5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", ""}}), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:12>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "injectValues", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<s:c>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeWithErrorWrapping", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:1>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:12>", "<d:1.5>", "<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapAndThrow", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<empty>", "<i:-1>", "1.1274567", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithUnwrapped", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", ",b,c"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyEndArrayForSingle", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"020", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_convertObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:4>", "<i:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveMergeAndNullSettings", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:3>", "<null>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", new String[]{"com.fasterxml.jackson.databind.PropertyName"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:8>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<null>", "<sample:0>", "<sample:3>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:0>", "<null>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithView", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>", "<s:a>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "<sample:11>", ".5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "2020-01-011"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyStringForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "supportsUpdate", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<null>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isPosInf", "java.lang.String", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_nonNullNumber", "java.lang.Number", "<null>"}}), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeUsingPropertyBasedWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_creatorReturnedNullException", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "<sample:12>", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.NullPointerException", actual.getClass().getName());
  assertEquals("java.lang.NullPointerException: JSON Creator returned null {getLocalizedMessage=JSON Creator returned null, getMessage=JSON Creator returned null, getStackTrace=[com.fasterxml.jackson.databind.deser.B...#242#833663937", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=ALWAYS_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "asArrayDeserializer", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:9>", "<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false,...#254#-1025148075", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "asArrayDeserializer", ""}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasProperty", "java.lang.String", "a b"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:15>", "<sample:0>"}, false), new String[][]{{"visibleInView", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:0>", "<sample:0>", "<s:>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveMergeAndNullSettings", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:9>", "<sample:0>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, has...#266#-661589563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "resolve", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=sample,shape=OBJECT,lenient=null,locale=a,timezone=0) {getLenient=null, getPattern=sample, getShape=OBJECT, hasLenient=false, hasLocale=true, hasPattern=true, hasShape=true, h...#233#-1777621541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ",b,c", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "a>b</a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:9>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:0>", "<sample:7>", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNumberForScalarCoercion", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.core.JsonParser", "<sample:3>", "<sample:4>"}}), new String[][]{{"hasPattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDateFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:2>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:4>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, has...#266#-661589563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceIntegral", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", "java.lang.String", "010a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "5."}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:5>", "<s:a>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findProperty", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>", "<sample:12>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<d:0.75>", "<s:o\u00e9ey>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:12>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "-0a"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findConvertingContentDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coerceTextualNull", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.annotation.Nulls,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:7>", "<sample:3>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromBoolean", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:7>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=false, has...#266#-661589563", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", "java.lang.String", "a`aaaaaaaaaaaaaaaaaaaaaaaaaaaa\n"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:10>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:2>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "TILE"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isEmptyOrTextualNull", "java.lang.String", "1.1345678901234567+1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueInstantiator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:3>", "<sample:3>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"getNullAccessPattern", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<s:jey>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", new String[]{"com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "withObjectIdReader", "com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=0, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "isCachable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"1.0d{\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:14>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "1234567890123456789012345678901E-5"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_handleTypedObjectId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,java.lang.Object", "<sample:13>", "<sample:0>", "<s:>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectUsingNonDefault", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:12>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getPropertyCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:11>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:9>", "<s:{9>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNumberForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>", "<sample:5>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_missingToken", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:11>", "<sample:1>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:2>", "<sample:9>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveManagedReferenceProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"-39"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromEmbedded", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<s:kfyy>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromObjectId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:7>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "1.123567i"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:10>", "-0./"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "createContextual", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:8>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findContentNullStyle", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "-2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "21474836482020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_deserializeOther", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>", "<sample:12>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:6>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "withBeanProperties", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializer", "hasViews", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeFromNull", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "deserializeWithExternalTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_failDoubleToIntCoercion", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "<sample:12>", "TITLE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"-58"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_coercedTypeDesc", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseLongPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolveInnerClassValuedProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty", "<sample:1>", "<sample:6>"}}), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_findSubclassDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:9>", "<i:-1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_shortOverflow", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:11>", "<i:-2147483648>", "<sample:2>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getEmptyAccessPattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "withIgnorableProperties", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "handleUnknownProperties", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<s:.ey>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_resolvedObjectIdProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "_parseBytePrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializer", "com.fasterxml.jackson.databind.deser.BeanDeserializer", "creatorProperties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializer", "wrapInstantiationProblem", "java.lang.Throwable,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}, 2), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=ALWAYS_NULL, getPropertyCount=!NullPointerException, hasViews=false, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
