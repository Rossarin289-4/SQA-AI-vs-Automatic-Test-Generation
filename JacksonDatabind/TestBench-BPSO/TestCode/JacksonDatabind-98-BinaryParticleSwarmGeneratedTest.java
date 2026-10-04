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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:4>", "<i:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:7>", "<sample:3>", "1", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "{\"r\":1}", "<i:-110>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<null>", "<null>", "a", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "-2147418111", "1E--5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<null>", "<sample:4>", "2147483598", "I"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:3>", "{\"a\":1~", "<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:0>", "<sample:3>", "<sample:0>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>", "<sample:6>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:3>", "<sample:7>", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "", "<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, true), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "1", "null"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:3>", "<s:Beyx>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Beyx", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<null>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:0>", "<d:1.5>", "10", "E-51"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:4>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:1>", "<s:b91>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:4>", "<sample:9>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:0>", "<i:-1>", "2147483647", "PT1["}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:3>", "<s:>", "9", "truei"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:4>", "<i:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:4>", "<s:>", "102", "1.12345678true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:4>", "<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:6>", "<sample:3>", "0", "I.1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "1e10.5", "<s:a]>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:1>", "<sample:5>", "<sample:6>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "/a b", "<i:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:4>", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:2>", "<s:lley>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:2>", "2147483647", "1L-1"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:0>", "<d:15.0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("15.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:4>", "<s:5b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:6>", "-29", "Hello, Workd/a/b"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:5>", "[1,2]", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:8>", "<`>b</>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:7>", "a+b,c", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"start", "", "2"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:2>", "<sample:5>", "<i:-94>", "0", "1.123356782020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:0>", "<i:-1>", "2147483647", "--1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:6>", "-0.0", "<i:-61>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, true), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:6>", "<sample:6>", "<s:>", "0", "1LL"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:7>", "<b:true>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:7>", "<sample:4>", "<s:a>", "129", "0xFFFFFFFF"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<i:0>", "-30", "tru{\"a\":1}"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:4>", "<d:15.0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:5>", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("15.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "1.5", "<i:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:5>", "<sample:0>", "-1", "E.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "2147483647", "1.251TITLE"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:7>", "a,b,c", "<i:-110>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "10", "  "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:1>", "<sample:7>", "<i:0>", "41", "1.12345678901234567"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:3>", "<sample:0>", "<null>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:4>", "<sample:5>", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<d:1.5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "0", "true\n"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:12>", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<s:b>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:1>", "1", "<s:0>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, true), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"start", "", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:6>", "<i:-3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:6>", "262149", "1.5T"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "3"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:3>", "<s:key>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "-0.0", "<i:-110>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "5"}, {"start", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:2>", "<sample:0>", "-2147483648", "httpp://example.com/a?b=c"}}, 3), new String[][]{{"start", "", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"start", "", "2"}, {"start", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<null>", "<i:-220>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:0>", "<sample:0>", "<s:>", "-1", "2020-01-01"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:4>", "2020-02-30T25:61:61", "<s:H>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:5>", "<sample:3>", "<s:b>", "2147483647", "a\"bc"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:6>", "<sample:7>", "<s:\njey>", "2147483647", "-/.00"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:0>", "1.5e30>0", "<i:-1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:7>", "<sample:3>", "0E-5", "<d:3.4000000000000004>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:8>", "<s:>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:4>", "<sample:4>", "0", "/x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"start", "", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:3>", "<sample:6>", "<sample:1>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:2>", "<s:key>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:7>", "<sample:0>", "<sample:1>", "2", "1.e300i"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:7>", "<s:>", "268435455", "W"}}, 3), new String[][]{{"start", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:7>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:2>", "a", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:7>", "<sample:2>", "2147483647", "11.5f"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:3>", "2.5f", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:10>", "-1073741770", "1.1234567m:0123456"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:7>", "0", "A1_"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:6>", "2147483647", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:2>", "0x4FFFFFFF", "<b:false>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "<s:C>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:6>", "<sample:1>", "28", "1.1234567890123451.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "3"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<s:kfy>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:1>", "<sample:3>", "-1", "010"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:1>", "<s:ey>", "65541", "t1ue"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kfy", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:7>", "12:I30:", "<s:ca>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:7>", "<sample:4>", "1e00", "<s:kec>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<i:-1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:6>", "<s:>"}}, 3), new String[][]{{"start", "", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "<s:m>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:5>", "/", "<s:p>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:4>", "<b:true>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:9>", "<null>", "<sample:5>", "<sample:3>"}}, 1), new String[][]{{"start", "", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:4>", "<sample:5>", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "2"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:2>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:1>", "<sample:1>", "0", "n<ull"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:7>", "2147483648", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:4>", "2020-02-30T2561:61", "<s:at>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:2>", "1.5f", "<d:-0.75>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:7>", "<s:key>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:2>", "<sample:7>", "-2147483648", "-1.6"}}, 3), new String[][]{{"start", "", "2"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:6>", "<sample:3>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:7>", "<sample:2>", ".5", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:7>", "<sample:0>", "-", "<b:true>"}}, 2), new String[][]{{"start", "", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:5>", "<i:110>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:6>", "<sample:4>", "0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:1>", "<sample:1>", "2020-02-30T25:61:611e1", "<s:`>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:5>", "<sample:0>", "<s:]b>", "0", ""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<null>", "<sample:1>", "\u00e9", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:4>", "1", "\u00e8-0.0"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"start", "", "3"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:4>", "<sample:10>", "<sample:4>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:6>", "1.5f", "<b:false>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:2>", "<i:1>", "-2147483648", "-1.L"}}, 3), new String[][]{{"start", "", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:4>", "<null>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:2>", "<sample:1>", "<i:-2147483648>", "2147483647", "a b"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
}
