package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>", "<sample:0>"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=a,shape=NUMBER_INT,locale=sample,timezone=null] {getPattern=a, getShape=NUMBER_INT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:13.5>", "<sample:2>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:8>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:4>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:7>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>", "<sample:2>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=ARRAY,locale=0,timezone=0] {getPattern=0, getShape=ARRAY, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>", "<sample:2>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:1>", "<sample:5>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<i:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"findValues", "java.lang.String,java.util.List", "2"}, {"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"isInt", "", "2"}, {"isBinary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:5>", "<sample:4>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:5>", "<sample:4>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}}, 3), new String[][]{{"usesObjectId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}}, 3), new String[][]{{"usesObjectId", "", "4"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 1), new String[][]{{"withFilterId", "java.lang.Object", "0"}, {"getDelegatee", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.5>", "<sample:3>", "<sample:7>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.49000000000000005>", "<sample:2>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"has", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}}, 1), new String[][]{{"isBigDecimal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:4>"}}, 1), new String[][]{{"asDouble", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}}, 1), new String[][]{{"asDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.75>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "ee"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.75>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "ee"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:15>", "<sample:5>", "<sample:3>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{".5", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:3>", "<empty>", "<i:-1>", "1"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "2020-02-30T25:61:61"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\".5\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#-849826406", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:1>", "<sample:6>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:3>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<sample:6>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<null>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<sample:5>", "<sample:5>"}}, 3), new String[][]{{"getContentSerializer", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 3), new String[][]{{"isUnwrappingSerializer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:6>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}, {"binaryNode", "byte[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"AA==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-1147121838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:7>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:7>", "<sample:7>", "<sample:2>", "<null>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:6>", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:4>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:65535>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:3>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:b>", "<sample:4>", "<sample:0>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:5>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:4>", "<sample:3>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=NUMBER,locale=a,timezone=0] {getPattern=sample, getShape=NUMBER, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 7, new String[][]{}, 3), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=ARRAY,locale=0,timezone=0] {getPattern=0, getShape=ARRAY, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "TITLE", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>", "<sample:5>", "<sample:0>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:4>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:4>", "<s:>", "<s:a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:9>", "<sample:2>", "<d:1.5>", "1.4"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>", "<sample:7>", "<sample:2>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<null>", "<empty>", "<i:2>", "--1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "{\"a\":1}"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<empty>", "<i:2>", "--1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"010", "true"}, false, 0, null, 2), new String[][]{{"isArray", "", "5"}, {"asInt", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<d:-30.8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "E1L"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<null>", "<sample:0>", "<s:}eyy>", "2"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<sample:3>", "<s:e>", "2"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<null>", "<s:b>"}}, 3), new String[][]{{"intValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<null>", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}, 3), new String[][]{{"intValue", "", "6"}, {"at", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:6>", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5f", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5f\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1833012289", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5f", "false"}, false, 0, null, 3), new String[][]{{"asInt", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b</a>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"<a>b</a>\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#-203934836", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b<:/a>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"<a>b<:/a>\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isConta...#346#673447654", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>bb<:/a>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"<a>bb<:/a>\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#1592073475", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>bb<:/a>", "true"}, false, 0, null, 3), new String[][]{{"canConvertToInt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:2>", "<empty>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:1>", "<sample:1>", "<sample:4>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<i:-2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>"}}, 3), new String[][]{{"canConvertToInt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:2>", "<i:-1>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=sample,timezone=sample] {getPattern=, getShape=ANY, hasLocale=true, hasPattern=false, hasShape=false, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=a,shape=NUMBER_INT,locale=sample,timezone=null] {getPattern=a, getShape=NUMBER_INT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>", "<sample:0>"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=ANY,locale=sample,timezone=sample] {getPattern=, getShape=ANY, hasLocale=true, hasPattern=false, hasShape=false, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>", "<empty>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=ARRAY,locale=0,timezone=0] {getPattern=0, getShape=ARRAY, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=NUMBER,locale=a,timezone=0] {getPattern=sample, getShape=NUMBER, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>"}, false, 10, new String[][]{}), new String[][]{{"hasLocale", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", ".5"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:3>", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "<sample:0>", "I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "<sample:0>", "I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.5>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:key>", "<sample:5>", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<sample:0>", "I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.5>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:key>", "<sample:5>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:3>", "<s:b>", "2147483647"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:1>", "<s:b>", "-2147483647"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>"}}), new String[][]{{"getDelegatee", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false), new String[][]{{"findPath", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, false), new String[][]{{"findValues", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:1>"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "5"}, {"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:1>"}}), new String[][]{{"isInt", "", "2"}, {"isBinary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:5>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "3"}, {"floatValue", "", "7"}, {"asInt", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:2>", "<empty>", "<i:0>", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:5>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<b:true>", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<sample:0>", "<i:37>", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:5>", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<null>", "<sample:7>", "<sample:5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:4>"}}), new String[][]{{"getDelegatee", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}}), new String[][]{{"usesObjectId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}}), new String[][]{{"usesObjectId", "", "4"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:1>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.5>", "<sample:2>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.5>", "<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<null>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2147483648\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#121970843", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:5>", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:2>", "<sample:4>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>"}}), new String[][]{{"has", "java.lang.String", "4"}, {"get", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>"}}), new String[][]{{"has", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}}), new String[][]{{"asDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false), new String[][]{{"floatValue", "", "3"}, {"hasNonNull", "int", "7"}, {"booleanNode", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"\u00e9", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:0>", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "integer"}}), new String[][]{{"isBigInteger", "", "0"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "7"}, {"hasNonNull", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:1>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}), new String[][]{{"isUnwrappingSerializer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:2>", "<sample:1>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:2>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}, {"binaryNode", "byte[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"AA==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-1147121838", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:0>", "<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<null>", "<null>", "<sample:7>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}, {"usesObjectId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12345678901234567", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.12345678901234567\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNo...#340#2107842552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}, {"hasNext", "", "2"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:a>", "<sample:5>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:4>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"null\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1823830347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:2>"}, false), new String[][]{{"isIntegralNumber", "", "6"}, {"get", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:2>", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:6>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<null>", "<null>"}}), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}), new String[][]{{"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:0>", "<i:-1>", "1.4"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"010", "true"}, false), new String[][]{{"isArray", "", "5"}, {"asInt", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "E1L"}}), new String[][]{{"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:1>", "<sample:2>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-1>", "<sample:3>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-1>", "<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<null>", "<sample:5>", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<i:18>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:6>", "<sample:6>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:4>", "<null>", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<null>", "false"}, false), new String[][]{{"intValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFFFFF", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0xFFFFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-2017615690", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFFFFhttp://example.com/a?b=c", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"isBigInteger", "", "3"}, {"arrayNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5f", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5f\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1833012289", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{".5", "false"}, false), new String[][]{{"asText", "", "6"}, {"isNumber", "", "1"}, {"get", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:0>", "<sample:2>", "<sample:6>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"number"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:key>", "<sample:1>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false), new String[][]{{"at", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:3>", "<s:>", "<a>b</a>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-14.5>", "<sample:4>", "<sample:3>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-14.5>", "<sample:5>", "<sample:9>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:3>", "<sample:4>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:0>", "<sample:1>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:0>", "<sample:1>", "<null>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:0>", "<sample:5>", "<null>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:a>", "<sample:1>", "<sample:4>", "<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:5>", "<sample:1>", "<i:-1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<sample:7>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:2>"}, false), new String[][]{{"isIntegralNumber", "", "7"}, {"asDouble", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:2097152>", "<sample:3>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:7>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:3>", "<sample:6>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:0>", "<sample:4>", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:3>", "<sample:6>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:0>", "<sample:5>", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"getDelegatee", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:3>", "<sample:6>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:2>", "<i:-1>", "{\"a\":1}"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:0>", "<sample:5>", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"getDelegatee", "", "7"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:2>", "<i:-1>", "{\"a\":1}"}}, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:4>", "<null>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:2>", "<i:-1>", "{\"a\":1}"}}, 1), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:4>", "<null>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:2>", "<i:-1>", "{\"a\":1}"}}), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:2>", "<sample:7>", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:3>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:4>", "<sample:5>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 15, new String[][]{}, 1), new String[][]{{"handledType", "", "5"}, {"properties", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<b:true>", "<i:-1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false), new String[][]{{"booleanNode", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "false"}, false), new String[][]{{"bigIntegerValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:1>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:3>", "<sample:4>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<s:>", "1.5f"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#616617116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<s:>", "1.5f"}}, 3), new String[][]{{"isObject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<s:>", "1.5f"}}, 3), new String[][]{{"isObject", "", "3"}, {"asLong", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<s:B>", "1.5f"}}, 3), new String[][]{{"isObject", "", "3"}, {"findValuesAsText", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.5>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1e10\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1612340385", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"e10"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"e10\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#1332716672", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{".5"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\".5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-5556939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5d2247483648/a/b"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:2>"}}, 1), new String[][]{{"asText", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5d2247483648/a/b"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5d2247483648/a/b\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#-1567744531", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1.5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-370442343", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.12345678901234567\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNo...#340#2107842552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1153897939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#420280014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa`aaaaaaa"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:4>", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}}, 3), new String[][]{{"findPath", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaaa`aaaaaaaa`a`aaaaa"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:4>", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.548>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}}, 3), new String[][]{{"findPath", "java.lang.String", "4"}, {"isInt", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaab`aa9aaaaaaa```haaaDa1x1E00xFFFFFFFF"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:4>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"findPath", "java.lang.String", "4"}, {"intValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:2>", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<null>"}}, 1), new String[][]{{"findParents", "java.lang.String", "4"}, {"contains", "java.lang.Object", "1"}, {"iterator", "", "3"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<null>"}}, 1), new String[][]{{"canConvertToLong", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:key>", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1153897939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"integer"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:12>"}}, 2), new String[][]{{"canConvertToLong", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/a//b"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/a//b\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-55677780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/a./b"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/a./b\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-158154773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/./b"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/./b\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-769819552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"//b"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"//b\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#1111639998", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "number"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<b:true>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:1>", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"2020-02-304T25:61:61"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:6>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2020-02-304T25:61:61\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#-1060911640", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"220-02-304T25:61:61"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:6>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"220-02-304T25:61:61\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNo...#340#-1071761430", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:6>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a,b,c\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#1209235786", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-9A,b,10xFFFFFFFF"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:4>", "<sample:1>"}}, 1), new String[][]{{"canConvertToInt", "", "5"}, {"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>"}}), new String[][]{{"properties", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"canConvertToInt", "", "7"}, {"deepCopy", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.12345678901234567\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNo...#340#2107842552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:a>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:4>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{".5^"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<null>", "<sample:0>"}}, 1), new String[][]{{"findParents", "java.lang.String,java.util.List", "6"}, {"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:5>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#420280014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false), new String[][]{{"asToken", "", "5"}, {"findValues", "java.lang.String", "0"}, {"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:4>", "<empty>"}, false), new String[][]{{"withShape", "com.fasterxml.jackson.annotation.JsonFormat$Shape", "1"}, {"getShape", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Shape", actual.getClass().getName());
  assertEquals("SCALAR", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:0>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:2>", "<sample:6>", "<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<null>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:0>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}), new String[][]{{"binaryValue", "", "6"}, {"hasNonNull", "int", "1"}, {"asText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<null>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:0>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 2), new String[][]{{"binaryValue", "", "6"}, {"hasNonNull", "int", "1"}, {"asText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<null>", "<sample:6>"}}), new String[][]{{"fields", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<null>", "<sample:6>"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:2>", "<empty>", "true"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "1.25", "false"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#616617116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:7>", "<null>"}}), new String[][]{{"isNumber", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<sample:2>", "<s:>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<null>", "<sample:1>", "<s:P>", "0"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"findValues", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:2>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:5>", "<null>", "<sample:5>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:0>", "<s:>", "10"}}), new String[][]{{"binaryNode", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:0>", "<sample:0>", "<s:>", "10"}}, 3), new String[][]{{"binaryNode", "byte[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0.1234", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0.1234\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-666406098", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"}.1234", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"}.1234\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-124869119", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"}.1234", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}, 2), new String[][]{{"asDouble", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Number {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Number, getClasses=[], getConstructors=[public java.lang.Number()], getDeclaredAnnotations=[], getDeclar...#665#-969526999", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "2"}, {"findValuesAsText", "java.lang.String,java.util.List", "3"}, {"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:7>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:b>", "<sample:3>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:4>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:6>", "<sample:2>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "4"}, {"asDouble", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<empty>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "6"}, {"asDouble", "double", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<empty>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "6"}, {"isIntegralNumber", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<null>", "<d:1.5>", "0"}}, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "6"}, {"findValues", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<null>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"isBoolean", "", "2"}, {"binaryNode", "byte[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"Ag==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#2026536428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:4>", "<sample:3>", "<empty>", "<sample:4>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"isBoolean", "", "2"}, {"binaryNode", "byte[]", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"Ag==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#2026536428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:5>", "<sample:5>", "<sample:7>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"isBoolean", "", "2"}, {"findValuesAsText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "\u00e9"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:10>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#616617116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:10>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:2>", "<sample:3>", "<sample:6>"}}, 2), new String[][]{{"isBigDecimal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:2>"}, false), new String[][]{{"fieldNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:3>"}, false, 10, new String[][]{}, 1), new String[][]{{"fieldNames", "", "3"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false), new String[][]{{"withFilterId", "java.lang.Object", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#616617116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:1>", "<s:>", "1"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:3>", "<sample:0>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:1>", "<s:>", "1"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:3>", "<sample:0>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:4>", "<i:1>", "2.2234557"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"-1", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:>", "<sample:1>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "PgT1H", "false"}}, 2), new String[][]{{"isBoolean", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createObjectNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
