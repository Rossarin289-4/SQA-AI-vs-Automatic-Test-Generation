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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:8>", "<sample:2>", "-2147483584", "A"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:1>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:4>", "<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:3>", "1.e", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:4>", "<sample:4>", "26", "00x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:2>", "<s:bh>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:1>", "<sample:3>", "d17483648", "<i:59>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:3>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bh", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:8>", "<sample:1>", "-2147483648", "1.123456789012345"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:5>", "<sample:6>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:5>", "<null>", "<sample:1>", "<sample:0>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:0>", "214483648", "<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:8>", "<b:true>", "25", "0x123456789PT1H"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:2>", "<sample:4>", "<sample:10>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "1.12345678Title", "<i:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:6>", "<i:-2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:8>", "<d:0.75>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "<b:false>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:5>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "<d:-59.25>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-59.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<d:0.75>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<s:>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:3>", "<sample:11>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:8>", "<sample:2>", "0", "2147483=648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:7>", "2022", ".51.12345078"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:8>", "<sample:1>", "<sample:2>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:0>", "<s:a>", "1073741820", "1.12344678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:2>", "<sample:5>", "65", "P"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:1>", "1.5d", "<i:59>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:6>", "2e1", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:6>", "<sample:5>", "<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:0>", "<s:\"b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "<i:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:4>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:11>", "<s:bh>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bh", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "<d:1.5>", "10", "--1"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:2>", "<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:6>", "<sample:10>", "0xFFFEFFFF", "<s:bhW>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>", "-5", "<i:59>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>", "<sample:3>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:6>", "<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:5>", "<sample:4>", "2147483647", "+11"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:0>", "01.e", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:8>", "<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:6>", "1", "a"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:6>", "<i:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:12>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:7>", "<sample:9>", "65536", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:3>", "<b:true>", "-2147483648", "abc010"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:2>", "<d:0.075>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:10>", "<sample:8>", "0xFFFFFFFF", "<s:u>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "50", "1.E"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:1>", "<d:30.0>", "0", "1.e0--1"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:2>", "<d:3.0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<b:true>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:12>", "<sample:2>", "Hel", "<d:-1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:10>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:5>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:4>", "<sample:2>", "12:30:46", "<s:bT>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:7>", "<s:bh>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:5>", "<sample:5>", "<sample:5>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<null>", "<i:-513>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:8>", "<s:bh>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<null>", "<sample:8>", "<s:key>", "0", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:10>", "<sample:3>", "<sample:10>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:3>", "<sample:1>", "<s:ey>", "0", "."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:7>", "0x1234\r6r789", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:2>", "<i:-4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:0>", "<sample:8>", "<null>", "0", "1+1"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:2>", "<sample:8>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:11>", "<s:b>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<sample:1>", "<sample:5>", "0", "0xFFFFFFFF"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<null>", "<sample:3>", "M", "<s:key>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<s:b>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<null>", "<sample:6>", "[1,2]", "<s:aB>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:8>", "<sample:0>", "2147483647", "{\"a\":1}PT1H"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<null>", "<sample:1>", "a>>b</a>", "<d:-0.75>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:5>", "<sample:4>", "0x1Ga", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer", "com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"}, new String[]{"<sample:3>", "<sample:6>", "<sample:5>", "<sample:6>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:6>", "\u00e9", "<b:true>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:3>", "1.1234567890123451.1234567890123456", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:4>", "<s:b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:3>", "<s:{>", "-2147483647", "a,b,c0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:2>", "<i:-2097125>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:1>", "<null>", "00x18", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<sample:3>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:4>", "1.22=5", "<s:rey>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:7>", "<s:bh_>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<null>", "<sample:8>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bh_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:1>", "<sample:5>", "<sample:1>", "<sample:3>"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:4>", "<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:1>", "/\t5", "<s:>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:5>", "<s:bh>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:6>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bh", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:5>", "<sample:4>", "<sample:7>", "<sample:8>"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<i:-52>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:7>", "<i:1>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "int", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<i:0>", "0", "2>020-01-01"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:7>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<sample:6>", "-1.50x1F", "<s:a.>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:3>"}}, 3), new String[][]{{"start", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "int", "java.lang.String"}, new String[]{"<null>", "<sample:6>", "0", "Hello,\037World"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:0>", "<sample:1>", "2147483647", "0e10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:7>", "<sample:8>", "`bc", "<sample:2>"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<s:aL>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:8>", "<sample:1>", "<i:0>", "10", "\u00e9"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:0>", "<null>", "1D-5", "<s:a0>"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:7>", "<i:59>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:1>", "A", "<sample:0>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:8>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:10>", "<sample:6>", "-1073741792", "\"1L"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:4>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:4>", "<sample:1>", "<i:-4>", "4194356", "-1.52147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<sample:10>", "<sample:4>", "<sample:0>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:6>", "<i:1>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:7>", "<sample:3>", "1.;1.123456789012345", "<i:1>"}}), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handleTypePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:8>", "<sample:3>", "[1.1234567890123456}", "<s:b>"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<sample:3>", "<sample:2>", "<sample:1>", "-55", "-1"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:2>", "1.1234567899012345", "<d:0.75>"}}, 1), new String[][]{{"start", "", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserializeAndSet", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object,int,java.lang.String", "<null>", "<sample:6>", "<s:1>", "2147483647", "1-25"}}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:10>", "<sample:1>", ".5", "<s:bh>"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer,com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator", "<sample:7>", "<null>", "<null>", "<sample:9>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<sample:3>", "<sample:8>", "0", "0x113456789"}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,int,java.lang.String", "<null>", "<sample:7>", "-32793", "-1.5"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}, {"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:7>", "<i:2>"}}, 1), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", ""}, {"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:2>", "<sample:3>", "hi", "<s:b>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "start", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", "handlePropertyValue", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Object", "<sample:3>", "<sample:0>", "A0x123456789", "<sample:1>"}}, 2), new String[][]{{"complete", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
}
