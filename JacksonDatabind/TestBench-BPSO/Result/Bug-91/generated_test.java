package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:0>", "<sample:12>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:3>", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:17>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:8>", "<sample:7>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:4>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>", "<null>"}}), new String[][]{{"cachedDeserializersCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:10>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>", "<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:3>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<sample:4>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:0>", "<sample:7>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:4>", "<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>", "<sample:6>"}}, 2), new String[][]{{"getNullValue", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:6>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:7>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:9>", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:4>", "<sample:15>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"flushCachedDeserializers", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:7>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:8>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:15>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:4>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:7>", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:13>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:2>", "<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:4>", "<sample:8>"}}), new String[][]{{"getEmptyValue", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:11>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>", "<sample:9>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:4>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:5>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:5>", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:12>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:6>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>", "<sample:3>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:5>", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<null>", "<sample:7>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:9>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:7>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:8>"}}, 3), new String[][]{{"cachedDeserializersCount", "", "1"}, {"findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:13>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"flushCachedDeserializers", "", "0"}, {"findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:6>", "<sample:16>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<sample:0>", "<sample:6>", "<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:9>", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:0>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:11>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}, {"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<null>"}}, 1), new String[][]{{"cachedDeserializersCount", "", "2"}, {"flushCachedDeserializers", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:14>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:8>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:4>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:2>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:6>", "<sample:15>", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:4>", "<sample:14>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:1>", "<sample:12>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:6>", "<sample:7>", "<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>", "<sample:3>"}, false), new String[][]{{"isCachable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:14>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:8>", "<sample:8>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>", "<sample:1>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:5>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<null>", "<sample:4>"}}, 3), new String[][]{{"flushCachedDeserializers", "", "6"}, {"cachedDeserializersCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:4>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>", "<sample:4>"}, false), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}, {"findBackReference", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:3>", "<sample:3>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:11>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 1), new String[][]{{"cachedDeserializersCount", "", "6"}, {"cachedDeserializersCount", "", "7"}, {"cachedDeserializersCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<null>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:5>", "<sample:16>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:9>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:10>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>", "<sample:15>"}}, 3), new String[][]{{"getDelegatee", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:14>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 2), new String[][]{{"cachedDeserializersCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:5>", "<sample:5>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}, 3), new String[][]{{"isCachable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:7>", "<sample:5>"}, false, 7, new String[][]{}, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:8>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"getNullValue", "", "2"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:14>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:3>", "<sample:2>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<sample:4>", "<sample:12>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<sample:7>", "<sample:12>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"getValueClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>", "<sample:12>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:8>", "<sample:6>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
