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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<null>", "<sample:0>", "<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "5"}, {"start", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:6>", "<sample:7>", "<sample:3>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:1>", "<sample:0>", "<null>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:6>", "<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:4>", "<s:Hb>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "<s:Hb>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:5>", "<s:H b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<s:H b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:2>", "+1", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:2>", "<s:H b>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:2>", "+1", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<s:H b>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:2>", "+1", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<s:H Hb>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:7>", "<i:1>", "0", "1.5f"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:2>", "+1", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H Hb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:7>", "<s:H Gb>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:7>", "<i:1>", "0", "1.5f"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:2>", "+1", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H Gb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "<s:b>", "-2147483648", "[1,2]"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, true, 0, null, 3), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:6>", "a b", "<s:H b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:5>", "<sample:0>", "<i:-13>", "-23", "Title"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:4>", "-0.0", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:3>", "-2147483648", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:4>", "-0.0", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:3>", "-2147483648", "\u00e9"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<s:>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:4>", "-0.0", "<i:2>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:3>", "-2147483648", "\u00e9"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, true), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "2"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:6>", "1.25", "<s:H b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:6>", "i", "<d:1.5>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:6>", "<sample:7>", "1", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>"}, true, 0, null, 3), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "2"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:6>", "<sample:4>", "<b:true>", "-1", " "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:4>", "<sample:1>", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:12>", "<sample:7>", "<b:true>", "0", " "}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:13>", "<sample:6>", "<s:>", "0", " <a>b</a>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:4>", " ", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:6>", "<sample:4>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:7>", "<sample:6>", "<s:>", "0", " <a>b</a>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:6>", "<sample:7>", "<null>", "-2147483648", "0x123456789"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<null>", "<sample:5>", "-1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:13>", "<sample:0>", "2147483647", "a,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:5>", "<sample:5>", "1", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:4>", "<sample:5>", "<sample:6>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"start", "", "5"}, {"start", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<s:\u00e9>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<null>", "2020-1-01", "<s:Hb>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:13>", "<sample:4>", "<sample:5>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>", "true", "<i:-1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false), new String[][]{{"start", "", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:6>", "<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:5>", "<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:6>", "<null>", "1.12345678", "<d:1.5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:2>", "<null>", "1", "\n"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<null>", "<sample:4>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, true, 0, null, 1), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:13>", "<sample:4>", "0", "0"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<null>", "<null>", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"start", "", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}, {"start", "", "6"}, {"start", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:13>", "<sample:4>", "0", "01.1234567890123456"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<null>", "<null>", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"start", "", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:4>", "<sample:2>", "<sample:0>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:4>", "<sample:2>", "<sample:0>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:4>", "<sample:2>", "<null>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:5>", "<sample:5>", "-31", "\n"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:13>", "<sample:9>", "<s:l bI>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:1>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:0>", "<sample:0>", "<i:1>", "2147483647", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:0>", "<sample:0>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, true, 0, null, 1), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:7>", "1E-C5", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"start", "", "3"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<i:0>", "2147483647", "1e10"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "1"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:6>", "1.5f", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "<s:H>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "<s:c>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "<s:c>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:1>", "<sample:3>", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:7>", "1:30:45", "<i:-131071>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:6>", "<sample:0>", "2147483647", "123456789012345678901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "1.5e300", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<null>", "<sample:7>", "<i:0>", "-1", " "}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:7>", "<sample:1>", "<s:H b>", "2147483647", "1.1234567890123456"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:2>", ".5", "<i:0>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:4>", "<sample:0>", "0", "1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:5>", "<null>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:1>", "<sample:0>", "-1", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:6>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<null>", "<sample:0>", "<null>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<s:>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:5>", "-1", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:0>", "<sample:4>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:11>", "<sample:3>", "<i:-2147483648>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<null>", "<sample:4>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:0>", "<null>", "<i:-1>", "-1", "a b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<null>", "<i:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:6>", "<null>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<null>", "<sample:6>", "0", "1L"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<null>", "<i:-1>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:13>", "<sample:5>", "<d:1.5>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:5>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:2>", "1E-5", "<sample:0>"}}, 3), new String[][]{{"start", "", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:5>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:5>", "<s:b>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:2>", "1E-5", "<sample:0>"}}, 3), new String[][]{{"start", "", "6"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:3>", "<sample:5>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:4>", "<s:>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:2>", "1E-5", "<s:b>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:6>", "<null>", "<s:>", "1", "\u00e9"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:7>", "<sample:0>", "2147483647", "null"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:4>", "<sample:1>", "10", "2021-01-01"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:6>", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:5>", "<sample:1>", "1073741834", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:6>", "!\u00e9", "<s:ke>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}, {"addExternal", "com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "7"}, {"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:7>", "<sample:7>", "0", "/a/b"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}, {"start", "", "3"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<null>", "<i:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true, 0, null, 2), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}, {"start", "", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}, {"start", "", "4"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:4>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:4>", "<sample:1>", "0", "0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:3>", "<s:keyX>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keyX", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<s:H b>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:2>", "<s:b>", "10", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "<s:H >"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:2>", "<s:b>", "10", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<s:.H >"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:2>", "<s:b>", "10", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".H ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<i:1>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:5>", "1", "1e10"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:1>", "<s:c>", "-118", "[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<i:-5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:5>", "1", "1e10"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:1>", "<s:c>", "-118", "[1,2]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<null>", "<d:-160.3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:6>", "Title", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:4>", "<sample:0>", "-16777216", "1e10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-160.3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<i:2>", "0", "/a/b"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, true, 0, null, 2), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "0"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}, {"start", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", "1", ""}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:6>", "-1", "\t"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:2>", "<a>b</a>", "<s:H c>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "builder", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, true), new String[][]{{"build", "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap", "1"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:1>", "<sample:3>", "} ", "<b:true>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
}
