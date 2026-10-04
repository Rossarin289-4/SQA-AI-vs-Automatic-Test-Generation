package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<sample:4>", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<i:1>", "[1,2]"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"o", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<sample:0>", "0"}}, 2), new String[][]{{"floatValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLE", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<sample:0>", "0"}}, 2), new String[][]{{"floatValue", "", "3"}, {"canConvertToInt", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"TITFE", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<sample:0>", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:a>"}}, 2), new String[][]{{"floatValue", "", "3"}, {"canConvertToInt", "", "0"}, {"getNodeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:7>", "<sample:0>", "<s:a>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:6>", "<sample:1>"}}, 3), new String[][]{{"booleanNode", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<sample:3>", "<s:>", "+1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 1), new String[][]{{"isFloatingPointNumber", "", "7"}, {"isMissingNode", "", "2"}, {"asDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<d:1.5>", "<b:true>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<null>", "<i:4>", "536870911"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b</a>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "1E-5", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"<a>b</a>\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, is...#329#470343463", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b</a>", "true"}, false, 0, null, 3), new String[][]{{"isNumber", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:6>", "<s:a>", "<s:p>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:2>", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"21.5a+:-c", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}, 1), new String[][]{{"findValues", "java.lang.String,java.util.List", "4"}, {"listIterator", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"21.5a+:-c", "true"}, false, 1, new String[][]{}, 1), new String[][]{{"findValues", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:`>", "<sample:0>", "<sample:7>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"+1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-368972844", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<s:>", "<s:>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:8>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"\u00e8"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:8>", "<empty>", "<d:1.5>", "1"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}, 2), new String[][]{{"findParents", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:1>", "<s:k-yy>", "nukp"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<b:false>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<i:-1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5d", "true"}, false, 0, null, 1), new String[][]{{"asLong", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5d", "true"}, false, 4, new String[][]{}, 1), new String[][]{{"asLong", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5d", "true"}, false, 4, new String[][]{}, 1), new String[][]{{"asLong", "long", "5"}, {"findParents", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<s:a>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:8>", "<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<b:true>"}}, 2), new String[][]{{"asToken", "", "0"}, {"isMissingNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}, 2), new String[][]{{"decimalValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 1), new String[][]{{"asBoolean", "", "0"}, {"fields", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:5>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-25>", "<sample:9>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:1>", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:4.45>", "<sample:1>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:10.350000000000001>", "<sample:3>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"asDouble", "", "6"}, {"isFloatingPointNumber", "", "1"}, {"isFloat", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:7>", "<sample:2>", "<i:2>", "1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<null>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:2>", "<null>", "-2147483648"}}, 3), new String[][]{{"usesObjectId", "", "5"}, {"isUnwrappingSerializer", "", "4"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 3), new String[][]{{"usesObjectId", "", "5"}, {"isUnwrappingSerializer", "", "4"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "3"}, {"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<s:a>", " "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:0>", "<null>", "<i:2>", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "<s:a>", " "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:0>", "<null>", "<i:2>", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "I"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "true.55", "true"}}, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "true.55", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "true.55", "true"}}, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:.e9y7>", "<null>", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<sample:1>", "<s:key>", "+1"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "j", "true"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "\u00e9", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:6>", "<sample:0>", "false"}}, 1), new String[][]{{"isNumber", "", "3"}, {"isFloatingPointNumber", "", "0"}, {"isNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"21\t47483638{\"a\":1}"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"21\\t47483638{\\\"a\\\":1}\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#437721078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"21\t47483638{\"a\":1}"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<s:>"}}, 3), new String[][]{{"asInt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:4>", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:8>", "<sample:1>"}}, 1), new String[][]{{"asToken", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "<s:b>", "Title"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:2>", "<sample:1>", "<s:>", "0"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:4>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:8>", "<empty>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:key>", "<null>", "<sample:2>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<empty>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:key>", "<null>", "<sample:3>", "<sample:2>"}}, 2), new String[][]{{"asText", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1e10", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1e10\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1480817926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1e10H", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1e10H\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainer...#342#2041250326", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1e10H", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:5>", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1e10H\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1060240975", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<i:1>", "[1,2]"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:4>", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<d:1.5>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:2>", "<sample:0>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<d:1.5>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<empty>", "<b:true>", "1.12345678901234567"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1F", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x1F\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1483191893", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1F", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x1F\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1860834832", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<empty>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12345678", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.12345678\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#2010545780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1345678", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.1345678\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#-1680288045", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.134568", "true"}, false), new String[][]{{"asBoolean", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"o", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<sample:0>", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"o\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-2117117845", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"o", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<sample:0>", "0"}}), new String[][]{{"floatValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"TITFE", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<sample:0>", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:a>"}}), new String[][]{{"floatValue", "", "3"}, {"canConvertToInt", "", "0"}, {"getNodeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:4>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<d:1.5>", "<sample:2>", "<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:0>", "<sample:1>", "<s:a>", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<sample:1>", "<i:0>", "I"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:6>", "<sample:1>"}}), new String[][]{{"booleanNode", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"asText", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:0>", "<sample:7>"}}), new String[][]{{"isPojo", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:0>", "<sample:7>"}}), new String[][]{{"binaryValue", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:0>", "<sample:8>"}}), new String[][]{{"binaryValue", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}), new String[][]{{"isFloatingPointNumber", "", "7"}, {"isMissingNode", "", "2"}, {"asDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<s:key>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:2>"}, false), new String[][]{{"findValues", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:2>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "1.5d"}}), new String[][]{{"fieldNames", "", "6"}, {"hasNext", "", "0"}, {"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false), new String[][]{{"isUnwrappingSerializer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5d\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1770491942", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}), new String[][]{{"findParents", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false), new String[][]{{"getDelegatee", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "4"}, {"asDouble", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:3>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}}), new String[][]{{"decimalValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false), new String[][]{{"asBoolean", "", "0"}, {"fields", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:8>", "<sample:0>"}}), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "true.55", "true"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<sample:1>", "<sample:0>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isNumber", "", "3"}, {"isFloatingPointNumber", "", "0"}, {"isNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2147483648\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#121970843", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<s:>"}}), new String[][]{{"canConvertToInt", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"21\t47483638"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"21\\t47483638\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true...#333#1649130260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"xd"}, false, 3, new String[][]{}), new String[][]{{"asInt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "string", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1e10\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1612340385", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:0>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:8>", "<sample:1>"}}), new String[][]{{"asToken", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:8>", "<sample:0>"}}), new String[][]{{"booleanNode", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false), new String[][]{{"bigIntegerValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:3>", "<sample:2>", "<s:key>", "0"}}), new String[][]{{"hasNonNull", "java.lang.String", "7"}, {"elements", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:1>", "<d:1.5>", "2147483648"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:5>", "<sample:5>"}}), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<null>", "false"}, false, 0, null, 3), new String[][]{{"asDouble", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 10, new String[][]{}, 3), new String[][]{{"asDouble", "double", "0"}, {"getNodeType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:2>", "<i:1>"}}), new String[][]{{"asDouble", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"l"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 2), new String[][]{{"at", "java.lang.String", "4"}, {"floatValue", "", "1"}, {"asText", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "TITLE", "false"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}}, 2), new String[][]{{"findParents", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "TITLE", "false"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}}, 3), new String[][]{{"findParents", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}}, 3), new String[][]{{"asDouble", "double", "1"}, {"asBoolean", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}}), new String[][]{{"binaryNode", "byte[]", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"/w==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#1066125898", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:4>", "<i:0>", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<i:0>"}}, 2), new String[][]{{"isBinary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:4>", "<i:0>", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<i:0>"}}, 2), new String[][]{{"asDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"a", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#1130545858", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"a", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-929785251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"a", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<sample:0>"}}, 2), new String[][]{{"booleanNode", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("false {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false,...#316#-1943447032", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:7>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=...#337#158739731", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 3), new String[][]{{"findValuesAsText", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:8>", "<i:2>", "<b:true>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:1>", "<sample:6>", "<null>", "<sample:7>"}}), new String[][]{{"isUnwrappingSerializer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:1>", "<sample:6>", "<null>", "<sample:7>"}}, 3), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:1>", "<sample:6>", "<null>", "<sample:7>"}}, 3), new String[][]{{"usesObjectId", "", "7"}, {"usesObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"usesObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:2>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:2>", "<sample:1>"}}, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"isFloatingPointNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 1), new String[][]{{"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:3>", "<s:a>", "10"}}), new String[][]{{"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:9>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"isEmpty", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:9>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:9>", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:9>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<b:true>", "<sample:2>", "<sample:2>", "<null>"}}, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:8>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:7>", "<i:1>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:0>", "<sample:1>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"a b", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:6>", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 3), new String[][]{{"hasNonNull", "java.lang.String", "7"}, {"booleanValue", "", "4"}, {"isContainerNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1}", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"{\\\"a\\\":1}\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isConta...#346#474629121", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1E-5", "true"}, false, 2, new String[][]{}, 3), new String[][]{{"asBoolean", "", "0"}, {"at", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1E-5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-164530934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<empty>"}, false), new String[][]{{"asDouble", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<empty>"}, false), new String[][]{{"asDouble", "double", "4"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<empty>"}, false, 0, null, 2), new String[][]{{"asDouble", "double", "4"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"asDouble", "double", "4"}, {"asBoolean", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"123456789012345678901234567890", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"123456789012345678901234567890\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#901801087", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false), new String[][]{{"getDelegatee", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:2>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:2>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"at", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", ".5"}}, 2), new String[][]{{"isIntegralNumber", "", "2"}, {"isBinary", "", "5"}, {"at", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"i\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1608261019", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:0>", "<sample:0>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:7>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:0>", "<sample:5>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:1>", "<null>", "1"}}, 2), new String[][]{{"findParents", "java.lang.String", "5"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:0>", "<null>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x12345678"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 2), new String[][]{{"getNodeType", "", "7"}, {"findValue", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}}, 3), new String[][]{{"getNodeType", "", "3"}, {"asBoolean", "", "1"}, {"deepCopy", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"q"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}}, 2), new String[][]{{"getNodeType", "", "3"}, {"asBoolean", "", "1"}, {"deepCopy", "", "1"}, {"POJONode", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:7>"}}, 1), new String[][]{{"getNodeType", "", "3"}, {"asBoolean", "", "1"}, {"deepCopy", "", "1"}, {"POJONode", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("key {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#800737485", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"TITLE113456n7890123456789032345678901.1234567890123456"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "\u00e9"}}, 1), new String[][]{{"fieldNames", "", "3"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "\u00e9"}}, 3), new String[][]{{"fieldNames", "", "3"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"Iulk"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 2), new String[][]{{"canConvertToLong", "", "3"}, {"findValues", "java.lang.String", "1"}, {"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"Iulk"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:7>", "<sample:2>"}}, 3), new String[][]{{"canConvertToLong", "", "3"}, {"findValues", "java.lang.String", "1"}, {"lastIndexOf", "java.lang.Object", "1"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"handledType", "", "6"}, {"isUnwrappingSerializer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}, 3), new String[][]{{"getDelegatee", "", "1"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"getDelegatee", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"isMissingNode", "", "5"}, {"asDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:7>", "<sample:1>"}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:a>"}}, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"getDelegatee", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:>"}}, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:>"}}, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"getDelegatee", "", "3"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<null>", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:6>", "<s:lkey>"}}, 3), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:2>", "<sample:6>", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}, 3), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"fields", "", "2"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<empty>"}, false), new String[][]{{"isFloat", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<empty>", "<i:2>", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:key>", "<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:4>", "<sample:10>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:je>", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "1.5"}}, 2), new String[][]{{"asText", "", "7"}, {"isDouble", "", "2"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, is...#351#420280014", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, null, 3), new String[][]{{"asBoolean", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, null, 3), new String[][]{{"asBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<empty>", "true"}, false, 0, null, 2), new String[][]{{"findValuesAsText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}, 2), new String[][]{{"findPath", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:3>", "false"}, false, 0, null, 3), new String[][]{{"arrayNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:1>", "<i:2>", "-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"asLong", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, null, 2), new String[][]{{"asLong", "", "0"}, {"findParents", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}}, 2), new String[][]{{"asLong", "", "0"}, {"POJONode", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("a {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-901225461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}), new String[][]{{"floatValue", "", "0"}, {"findValues", "java.lang.String", "0"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1e10\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1612340385", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}}, 3), new String[][]{{"asDouble", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:0>", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:0>", "<s:key>", "1.5f"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:4>", "<sample:3>", "<b:true>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"true\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1843749444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:0>", "<s:key>", "1.5f"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:4>", "<sample:3>", "<b:true>", "10"}}, 1), new String[][]{{"booleanValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:0>", "<s:key>", "1.5f"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:4>", "<sample:3>", "<b:true>", "10"}}, 1), new String[][]{{"booleanValue", "", "7"}, {"doubleValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:5>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:4>", "<empty>", "<s:>", "null"}}, 3), new String[][]{{"asLong", "long", "2"}, {"fieldNames", "", "6"}, {"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("type", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false), new String[][]{{"asLong", "long", "2"}, {"fieldNames", "", "6"}, {"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("type", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"decimalValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:6>", "<sample:3>"}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}, {"asText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}, {"fields", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<null>", "<sample:1>", "<sample:0>", "2147483647"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:5>", "<sample:6>"}}, 1), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"\014a"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\\fa\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#-1353280429", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "1.1234567890123456"}}, 3), new String[][]{{"findPath", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<sample:0>", "[1,2]"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:b>", "<sample:1>", "<sample:6>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"binaryValue", "", "3"}, {"isNumber", "", "2"}, {"findValues", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<empty>", "false"}, false, 0, null, 1), new String[][]{{"hasNonNull", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<null>", "<sample:0>", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:0>", "<s:kdy>", "10"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:1>"}}, 2), new String[][]{{"asBoolean", "boolean", "5"}, {"binaryNode", "byte[]", "5"}, {"floatValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:1>"}}, 2), new String[][]{{"asInt", "", "5"}, {"binaryNode", "byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"BAUG\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#1048989921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<sample:1>"}}, 2), new String[][]{{"asInt", "", "5"}, {"asInt", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:3>", "<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "handledType", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-2147483648>", "<sample:6>", "<sample:0>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, null, 3), new String[][]{{"arrayNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "1.5", "true"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:0>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:0>", "<sample:1>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"pWEia>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"pWEia>\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#1422553622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"findParents", "java.lang.String", "2"}, {"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:key>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<s:\"a>"}}, 2), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}}, 3), new String[][]{{"asToken", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", ".5"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}}, 1), new String[][]{{"bigIntegerValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<i:2>"}}, 2), new String[][]{{"asText", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<sample:3>", "<i:-1073741824>", "10"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:0>", "<b:true>", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "\n\n"}}, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:2>", "<sample:4>", "<sample:2>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<empty>", "<i:2>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:6>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:4>", "<sample:0>"}}, 3), new String[][]{{"binaryValue", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<empty>"}, false, 0, null, 3), new String[][]{{"floatValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"floatValue", "", "2"}, {"isContainerNode", "", "7"}, {"isIntegralNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"floatValue", "", "2"}, {"isContainerNode", "", "7"}, {"isIntegralNumber", "", "6"}, {"elements", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<empty>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "PT1H"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "-1"}}, 3), new String[][]{{"hasNonNull", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<sample:0>", "<i:-1>", " "}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:7>", "<sample:1>", "<s:a>", "2147483647"}}, 1), new String[][]{{"handledType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:3>", "<i:-1>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:11>", "<sample:5>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:5>", "<s:b>", "<i:20>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:2>", "<s:key>", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"=  "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "+1"}}, 2), new String[][]{{"asInt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 1), new String[][]{{"fieldNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<null>", "<b:true>", "0"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}}, 1), new String[][]{{"findValues", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String", "\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1023>", "<sample:6>", "<null>"}}, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}, {"withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>", "<s:a>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-1>", "<sample:0>", "<sample:2>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createSchemaNode", "java.lang.String,boolean", "010", "true"}}, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}, {"get", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 1), new String[][]{{"handledType", "", "6"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "3"}, {"asInt", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "usesObjectId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 0, null, 3), new String[][]{{"fields", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasNonNull", "int", "0"}, {"get", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:8>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdKeySerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:5>", "<sample:5>"}}, 3), new String[][]{{"elements", "", "0"}, {"hasNext", "", "4"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
