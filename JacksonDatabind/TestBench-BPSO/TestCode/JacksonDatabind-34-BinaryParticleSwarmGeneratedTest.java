package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:8>", "<i:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:6>", "<sample:4>", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:1>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>"}}, 3), new String[][]{{"binaryNode", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:2>", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:3>", "<sample:2>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<s:o>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<null>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 4, new String[][]{}, 3), new String[][]{{"isBigInteger", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>", "<s:c>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<null>", "<sample:6>", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<i:-134217726>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<sample:3>"}, false, 4, new String[][]{}, 3), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:1>", "<sample:1>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:a>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:0>", "<sample:1>", "<empty>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:0>", "<sample:5>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:0>", "<sample:6>", "<sample:7>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.25>", "<sample:8>", "<sample:6>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isIntegralNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:3>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:4>", "<sample:2>", "<s:a>", "9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:W>", "<sample:2>", "<sample:4>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:4>", "<sample:3>", "<sample:3>", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:5>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:1>", "<sample:3>", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<i:-12>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:1>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"--12020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"--12020-01-01\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tru...#334#1041789449", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:10>", "<null>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:1>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 2), new String[][]{{"get", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:0>", "<sample:2>", "<null>", "<sample:1>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-11.5null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:2>", "<sample:0>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<null>", "<s:aa>", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-11.5null\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#1854422551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:0>", "<sample:2>", "<sample:0>", "<sample:7>"}}, 2), new String[][]{{"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>", "<s:ky>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>", "1.5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<d:-22.85>", "0w1F"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:6>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:6>", "<sample:1>", "<i:0>", "5."}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:8>", "true"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:2>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:3>", "<b:false>", "0x1234567890xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "1.1234567", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<null>"}}, 2), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:a>", "<sample:1>", "<sample:6>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:4>", "<sample:7>", "<sample:7>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<sample:4>", "<sample:5>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"doubleValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5di", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5di\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1352573255", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-262145>", "<sample:4>", "<sample:5>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "12345678901234567890123456789//a/b", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:5>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":2}", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:6>", "<sample:6>"}}, 3), new String[][]{{"isBinary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 3), new String[][]{{"properties", "", "7"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:2>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#1670214290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"properties", "", "3"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:8>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<i:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:4>", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:0>", "<empty>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:1>", "<empty>", "<s:\r>", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:3>", "<null>", "<sample:1>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<empty>"}}), new String[][]{{"isBinary", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:b>", "<sample:6>", "<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<sample:3>", "<i:-50>", "-8"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<s:mb>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:p>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:2>", "<i:0>", "<i:-43>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=null,timezone=null] {getPattern=, getShape=ANY, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"2020-01-01TITLE"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2020-01-01TITLE\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=t...#336#-301713608", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-9>", "<sample:4>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:1>", "<sample:0>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"010", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"010\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#196403339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}), new String[][]{{"isBigInteger", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:false>", "<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:5>", "<i:-43>", "<a>b</a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:4>", "<sample:1>", "<s:key:>", "1.12345678"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:4>", "<sample:6>", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:9>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<s:a>"}}), new String[][]{{"asLong", "", "2"}, {"binaryValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"4."}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"4.\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#1993416936", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:5>", "<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"Hello, World", "true"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"Hello, World\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true...#333#244504250", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false), new String[][]{{"get", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<s:`>", "<s:>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:6>", "<null>", "<sample:4>", "<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:0>", "<sample:3>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, i...#352#-1479643587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>", "<sample:0>"}, false), new String[][]{{"hasTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{".", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\".\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#-1248846449", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>", "<sample:3>"}, false), new String[][]{{"timeZoneAsString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false), new String[][]{{"isBoolean", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:10>", "<sample:7>"}}), new String[][]{{"isUnwrappingSerializer", "", "7"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<s:b>", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "Hello, World1.12345678901234567", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false), new String[][]{{"isUnwrappingSerializer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:0>"}, false, 4, new String[][]{}), new String[][]{{"isBigInteger", "", "4"}, {"booleanValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b</a>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"<a>b</a>\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, is...#329#470343463", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-1048614>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-9>", "<sample:4>", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false), new String[][]{{"getDelegatee", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"12:30:45", "true"}, false, 7, new String[][]{}), new String[][]{{"isBinary", "", "5"}, {"has", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"true\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1843749444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:9>", "<i:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFFFFF", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0xFFFFFFFF\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#-1764886757", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1E-5", "true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1E-5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-164530934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:8>", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=NUMBER,locale=a,timezone=0] {getPattern=sample, getShape=NUMBER, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:b>", "<sample:4>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<null>", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1L5."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:8>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1L5.\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1588561986", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:5>", "<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=STRING,locale=a_0_sample,timezone=a] {getPattern=0, getShape=STRING, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:5>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1G", "false"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x1G\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1402199313", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"get", "int", "5"}, {"floatValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=a,shape=NUMBER_INT,locale=sample,timezone=null] {getPattern=a, getShape=NUMBER_INT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<b:true>", "<sample:5>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:kPkey>", "<sample:5>", "<sample:6>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:8>", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:2>", "<sample:1>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<null>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:9>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:9>", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}), new String[][]{{"findValuesAsText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<s:pa>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<sample:3>", "<s:a,>", "\013"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>", "<sample:3>", "<sample:0>"}}), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false), new String[][]{{"handledType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<null>", "<null>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>", "<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=BOOLEAN,locale=0,timezone=null] {getPattern=sample, getShape=BOOLEAN, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<s:c>"}}, 1), new String[][]{{"findParent", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:-45>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "i1L", "true"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:3>", "<sample:6>", "<sample:2>"}}), new String[][]{{"handledType", "", "3"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}), new String[][]{{"handledType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false), new String[][]{{"properties", "", "3"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.8>", "<sample:3>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:2>", "<sample:2>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:3>", "<sample:0>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"isUnwrappingSerializer", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}), new String[][]{{"binaryNode", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:4>", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"TLitle", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:0>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"TLitle\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-410019254", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false), new String[][]{{"isUnwrappingSerializer", "", "4"}, {"usesObjectId", "", "7"}, {"properties", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-1>", "<sample:1>", "<sample:5>", "<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<sample:7>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<null>", "<empty>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:1>", "<empty>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:5>", "<sample:5>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 1), new String[][]{{"getNodeType", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:2>", "<sample:5>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>", "<sample:5>", "<sample:8>"}}, 3), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<i:-1>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "true"}, false), new String[][]{{"isContainerNode", "", "2"}, {"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:3>", "<sample:4>", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false), new String[][]{{"properties", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:6>", "<null>", "<sample:3>"}}, 3), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{}), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-10>", "<sample:2>", "<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:7>", "<sample:3>"}}), new String[][]{{"hasNonNull", "int", "5"}, {"findValuesAsText", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<b:false>", "<sample:5>", "<sample:8>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"fields", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "null1.12345678true"}}, 2), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:ke>", "<null>", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:10>", "<sample:1>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "<i:43>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-10>", "<sample:1>", "<sample:0>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"a "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a \"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#835654477", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"properties", "", "7"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:1>", "<i:1>", "trte/a/b"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=sample,timezone=sample] {getPattern=, getShape=ANY, hasLocale=true, hasPattern=false, hasShape=false, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:0>", "<i:-42>", "2147483W48"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:1>"}, false), new String[][]{{"isUnwrappingSerializer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "nll"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false), new String[][]{{"isInt", "", "2"}, {"get", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"asText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:3>", "<s:>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"findPath", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:2>", "<sample:3>"}}), new String[][]{{"at", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"-1fabc", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}, 2), new String[][]{{"binaryValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, null, 2), new String[][]{{"isEmpty", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5/a/b", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:61>", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"has", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<null>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:1>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x123455789null"}, false, 0, null, 1), new String[][]{{"isContainerNode", "", "6"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<d:2.06>", "<i:-1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:5>", "<sample:2>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:6>", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}, 2), new String[][]{{"hasLocale", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>", "<sample:0>", "<sample:5>"}}, 2), new String[][]{{"asLong", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:0.15>", "<sample:5>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:_>", "<sample:2>", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:5>", "<sample:9>"}, false), new String[][]{{"_withValueTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "-11.5", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567-1", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.1234567-1\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCon...#348#722548988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:6>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:7>", "<sample:5>", "<sample:4>"}}), new String[][]{{"isUnwrappingSerializer", "", "3"}, {"isEmpty", "java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:10>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=STRING,locale=a_0_sample,timezone=a] {getPattern=0, getShape=STRING, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-1.5>", "<sample:4>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\" \"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#287863068", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 3), new String[][]{{"asDouble", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678901.12345678"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:3>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1234567890123456789012345678901.12345678\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean...#361#1277118112", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:6>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:7>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"{\"a\":T1}"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"{\\\"a\\\":T1}\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-110558598", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:4>", "<s:a>"}}, 1), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678902020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"asLong", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:6>", "<null>"}, false, 7, new String[][]{}, 1), new String[][]{{"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:3>", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 0, null, 2), new String[][]{{"findValuesAsText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:7>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:7>", "<sample:3>", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "2147436648"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<s:a>\u00e9>"}}), new String[][]{{"decimalValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2047483648", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2047483648\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-1341667174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1Finteger", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:4>", "<sample:4>", "<sample:5>"}}, 2), new String[][]{{"findParents", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2147483648c", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 2), new String[][]{{"asDouble", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<empty>", "true"}, false), new String[][]{{"floatValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:6>"}}, 3), new String[][]{{"getTimeZone", "", "2"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"booleanValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{" b", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:`h>", "<sample:7>", "<sample:10>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\" b\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#1465731349", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"-1", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-1332192750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:1>", "<sample:3>", "<d:1.5>", "18"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}, 2), new String[][]{{"isInt", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasNext", "", "6"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:1>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<null>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<i:-18>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:6>", "<sample:2>", "<s:a>", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=ce"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:4>", "<s:a>"}}, 3), new String[][]{{"findParents", "java.lang.String,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"getLocale", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<null>", "true"}, false), new String[][]{{"decimalValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:0>", "<i:-1>", "<s:i>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"withTimeZone", "java.util.TimeZone", "5"}, {"valueFor", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonFormat {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonFormat, getClasses=[class com.fasterxml.jackson...#873#-766877138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false, 0, null, 2), new String[][]{{"getShape", "", "2"}, {"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:6>", "<sample:3>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 1), new String[][]{{"decimalValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"a 5b2020-01-01", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<i:-31>"}}, 3), new String[][]{{"findValuesAsText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"http://example.com/a?b=c", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:t>", "<sample:7>", "<sample:3>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"http://example.com/a?b=c\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean...#361#-134089319", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.<52"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<s:kety>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.<52\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1252333032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 3), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 1), new String[][]{{"asLong", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:2>", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=BOOLEAN,locale=0,timezone=null] {getPattern=sample, getShape=BOOLEAN, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:10>", "<s:9ey>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<null>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:7>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
