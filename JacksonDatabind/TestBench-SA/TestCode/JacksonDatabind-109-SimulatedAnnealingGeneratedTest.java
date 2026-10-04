package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2147483648", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2147483648\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#325#623322222", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer$BigDecimalAsStringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.238>", "<sample:2>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-1073741791>", "<sample:2>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:7>", "<sample:3>", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"getDelegatee", "", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}, {"isFloatingPointNumber", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:8>", "<sample:1>"}, false, 1, new String[][]{}, 3), new String[][]{{"hasLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:7>", "<sample:1>"}}, 3), new String[][]{{"hasLenient", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<null>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:key>", "<sample:5>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:2>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:6>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:2>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:6>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:4>", "<sample:0>", "<sample:5>", "<null>"}}, 2), new String[][]{{"withValueFilter", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=CUSTOM,content=ALWAYS,valueFilter=java.lang.Object.class,contentFilter=int.class) {getContentInclusion=ALWAYS, getValueInclusion=CUSTOM}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<empty>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#337#-1502204625", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}, 3), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:2>"}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"number", "true"}, false, 0, null, 2), new String[][]{{"hasNonNull", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<null>", "<sample:0>", "-0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:2>", "<i:-1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "1E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=BOOLEAN,lenient=false,locale=sample,timezone=sample,features=EMPTY) {getLenient=false, getPattern=, getShape=BOOLEAN, hasLenient=true, hasLocale=true, hasPattern=false,...#250#-99084347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<null>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:2>", "<i:-29>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "1E-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<null>", "<sample:2>", "2147483647"}}, 2), new String[][]{{"arrayNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isEmp...#303#-1317169037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"timeZoneAsString", "", "2"}, {"getFeatures", "", "3"}, {"without", "com.fasterxml.jackson.annotation.JsonFormat.Feature[]", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Features", actual.getClass().getName());
  assertEquals("(enabled=0x0,disabled=0x6)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:10.5>", "<sample:5>", "<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer$BigDecimalAsStringSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<null>", "<s:>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:1>", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:2>", "<i:2>", ".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:10>", "<sample:7>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-2147483647>", "<sample:5>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<i:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:b>", "<sample:6>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:5>", "<sample:1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"+1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#317#1531383399", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:4>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}, 3), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "2"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"\t", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:5>", "<sample:4>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:5>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\\t\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#333#-600257986", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
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
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:2>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<null>", "<sample:2>", "<sample:6>"}}, 1), new String[][]{{"withValueFilter", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=CUSTOM,content=NON_NULL,valueFilter=java.lang.Integer.class,contentFilter=generated.algorithm.SearchInputFactory_scaffolding$GenericSub.class) {getContentInclusion=NON_NULL, ge...#223#1301960034", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:0>", "<null>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:6>", "<sample:6>", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<null>", "<s:b>", "1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-536870912>", "<sample:2>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-1073741824>", "<sample:7>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-1073741791>", "<sample:5>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:2>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#317#-1243315419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-1073741731>", "<sample:4>", "<sample:0>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:7>", "<sample:3>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFFFFF", "true"}, false, 0, null, 1), new String[][]{{"asInt", "", "5"}, {"bigIntegerValue", "", "4"}, {"isFloat", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:5>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:12>", "<sample:3>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<sample:7>", "<sample:2>"}}, 1), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<sample:7>", "<sample:2>"}}, 1), new String[][]{{"hasNext", "", "5"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:2>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:41>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:4>", "<sample:7>"}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}, {"isNull", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:7>", "<sample:5>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:0>", "<i:1>", "1.5d"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, null, 3), new String[][]{{"getContentFilter", "", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "2"}, {"getContentInclusion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:1>", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"getContentFilter", "", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "2"}, {"getContentInclusion", "", "2"}, {"withContentFilter", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=NON_EMPTY,content=CUSTOM,valueFilter=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf.class,contentFilter=java.lang.Integer.class) {getContentInclusion=CUSTOM, ge...#226#-56789160", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<b:false>", "<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:0>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>", "<sample:1>", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<null>", "false"}}, 1), new String[][]{{"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<i:1>", "<i:1>"}}, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "0"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "\n"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:94.55>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:1>", "<sample:4>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:key>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:1>", "<sample:4>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:94.55>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:1>", "<sample:4>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"214483648", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"214483648\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#324#1116130639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2144\t3648", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2144\\t3648\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#325#1151850367", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=0,shape=NUMBER_INT,lenient=null,locale=a_0_sample,timezone=a,features=EMPTY) {getLenient=null, getPattern=0, getShape=NUMBER_INT, hasLenient=false, hasLocale=true, hasPattern=...#255#920407967", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>", "<sample:0>"}, false), new String[][]{{"valueFor", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonFormat {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonFormat, getClasses=[class com.fasterxml.jackson...#873#-766877138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:8>", "<sample:0>"}, false, 10, new String[][]{}), new String[][]{{"hasPattern", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:10>", "<sample:0>"}, false, 10, new String[][]{}), new String[][]{{"hasPattern", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:4>", "<null>", "false"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:7>", "<sample:0>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=NON_EMPTY,content=NON_EMPTY,valueFilter=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf.class,contentFilter=generated.algorithm.SearchInputFactory_scaffolding$Ge...#277#-838168910", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:0>", "<sample:6>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:7>", "<null>", "false"}}), new String[][]{{"findValue", "java.lang.String", "7"}, {"binaryNode", "byte[],int,int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false, isE...#305#1133203348", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:0>", "<sample:6>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:3>"}}), new String[][]{{"asInt", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#317#2084429978", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.12345678\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#325#-359062302", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:7>", "<sample:7>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializers", "com.fasterxml.jackson.databind.ser.std.NumberSerializers", "addAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:4>", "<sample:3>", "<i:0>", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<i:1>", "<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:3>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:3>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<empty>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#337#-1502204625", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, false), new String[][]{{"asToken", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}), new String[][]{{"asToken", "", "5"}, {"findValues", "java.lang.String,java.util.List", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:3>", "<null>", "<s:>", "1"}}), new String[][]{{"asToken", "", "5"}, {"booleanNode", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#308#-970602807", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:3>", "<null>", "<s:>", "1"}}), new String[][]{{"asToken", "", "5"}, {"isBigInteger", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}}), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:1>", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"number", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"number", "true"}, false), new String[][]{{"hasNonNull", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "<sample:0>", "-0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "0"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:4>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<d:1.5>", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:5>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "true"}, false), new String[][]{{"asDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>", "<sample:0>"}, false, 6, new String[][]{}), new String[][]{{"getTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}), new String[][]{{"getLocale", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a {getCountry=, getDisplayCountry=, getDisplayLanguage=a, getDisplayName=a, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=a, getScript=...#235#869437072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<sample:3>", "<b:true>", "i"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:2>", "<sample:6>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:2>", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "1.5", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:3>", "<null>", "<sample:1>", "2147483647"}}), new String[][]{{"arrayNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isEmp...#303#-1317169037", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<null>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.5>", "<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:4>", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:-0.25>", "<sample:2>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<null>", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-1>", "<sample:5>", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-1>", "<sample:2>", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:b>", "<sample:4>", "<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>", "<sample:2>"}, false), new String[][]{{"getValueInclusion", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("CUSTOM", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:1>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.5>", "<sample:7>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:6>", "<sample:2>", "<sample:2>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "1"}, {"get", "int", "5"}, {"findValues", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"number", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}), new String[][]{{"findParent", "java.lang.String", "4"}, {"isBigDecimal", "", "0"}, {"findParents", "java.lang.String,java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<empty>", "true"}, false), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "7"}, {"trimToSize", "", "5"}, {"set", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<null>", "<i:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"http://example.com/a?b=c\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#339#1622050247", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:b>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "a", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<empty>"}, false), new String[][]{{"hasNonNull", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:1>", "<empty>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "http://example.com/a?b=c", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false), new String[][]{{"properties", "", "4"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:>", "<sample:2>", "<sample:0>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<sample:1>", "<null>", "10000"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "<a>b</a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<null>", "<sample:6>", "<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<sample:0>", "<s:key>", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:5>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:0>", "<sample:2>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-1073741791>", "<sample:5>", "<sample:0>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:0>", "<sample:1>", "<sample:1>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "0"}}), new String[][]{{"asLong", "long", "3"}, {"findValuesAsText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<null>", "<sample:7>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:2>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:41>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:4>", "<sample:7>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}, {"isNull", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:2>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:4>", "<sample:7>"}}), new String[][]{{"getDelegatee", "", "1"}, {"getDelegatee", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<null>", "<sample:5>", "<sample:3>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:0>", "<sample:0>"}}), new String[][]{{"getContentFilter", "", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonInclude$Value", "2"}, {"getContentInclusion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "<null>", "true"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#1329613778", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>", "<null>"}, false), new String[][]{{"withContentInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "4"}, {"getValueFilter", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-240>", "<sample:2>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-1>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:3>", "<null>", "true"}}), new String[][]{{"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.7275>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:0>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:6>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:>", "<sample:1>", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:1>"}, false), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "1"}, {"properties", "", "2"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-0.5>", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:37>", "<sample:7>", "<sample:1>"}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", ""}}), new String[][]{{"isNull", "", "3"}, {"bigIntegerValue", "", "3"}, {"binaryNode", "byte[]", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"/w==\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#309#-1966284196", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-59>", "<sample:5>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:3>", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Number", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<sample:2>", "<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, false), new String[][]{{"asText", "", "2"}, {"binaryNode", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:5>", "<sample:0>", "<sample:6>"}}, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}, {"withFilterId", "java.lang.Object", "0"}, {"withFilterId", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<null>", "<null>", "<s:>", "0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>", "<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:6>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a b\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#318#1029480818", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<s:b>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:7>", "<sample:0>", "<s:key>", "10000"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<null>", "<sample:7>"}}), new String[][]{{"asInt", "", "2"}, {"elements", "", "6"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"number"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:3>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "123456789012345678901234567890", "false"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:b>", "<sample:3>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x1F\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#319#-1458415234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:1>"}, false), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false), new String[][]{{"serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:7>", "<empty>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:6>", "<null>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:0>"}}), new String[][]{{"withContentFilter", "java.lang.Class", "3"}, {"getValueInclusion", "", "7"}, {"getValueInclusion", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("ALWAYS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:7>"}, false), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.util.Collection", "7"}, {"_withResolved", "com.fasterxml.jackson.databind.BeanProperty,java.lang.Boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<empty>", "<sample:1>", "-1.5"}}), new String[][]{{"at", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:6>"}, false), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "4"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:1>", "<i:2>", "10000"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:6>", "<sample:2>", "<s:key>", "<a>b</a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<sample:1>", "<i:0>", "9998"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:3>", "<sample:6>", "<sample:2>"}}), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:3>", "<sample:0>", "<sample:7>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<d:1.5>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:4>", "<sample:6>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:5>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:1>", "<s:a>"}}), new String[][]{{"fields", "", "6"}, {"next", "", "1"}, {"getValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TextNode", actual.getClass().getName());
  assertEquals("\"number\" {canConvertToInt=false, canConvertToLong=false, getNodeType=STRING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=fal...#312#1984335620", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:6>", "<sample:2>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "7"}, {"isEmpty", "", "3"}, {"asInt", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:3>", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:4>", "<null>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<i:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:4>", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:3>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:3>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1e10", "true"}, false, 0, null, 1), new String[][]{{"findValues", "java.lang.String", "3"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"getDelegatee", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<sample:7>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:2>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"isUnwrappingSerializer", "", "6"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#337#-889102345", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "010", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<b:true>", "<sample:7>", "<sample:3>", "<sample:6>"}}), new String[][]{{"getContentFilter", "", "5"}, {"getContentFilter", "", "0"}, {"getContentFilter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:2>", "<null>", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "9999"}}), new String[][]{{"isContainerNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"--1", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String,boolean", "<a>b</a>", "false"}}, 1), new String[][]{{"elements", "", "4"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"withFilterId", "java.lang.Object", "0"}, {"properties", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<sample:1>", "<i:0>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:6>", "<sample:1>", "<i:0>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:1>", "<sample:0>"}}), new String[][]{{"asBoolean", "boolean", "2"}, {"isArray", "", "4"}, {"binaryValue", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"I", "true"}, false, 0, null, 3), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"findParents", "java.lang.String,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"isBinary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:1>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:7>", "<sample:7>", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<null>", "<sample:2>", "<s:a>", "I"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:1>", "<sample:3>", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:2>", "<sample:0>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}, {"binaryNode", "byte[]", "0"}, {"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<i:-1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>", "<empty>"}, false, 0, null, 1), new String[][]{{"withContentFilter", "java.lang.Class", "7"}, {"getContentFilter", "", "7"}, {"getValueInclusion", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", "java.lang.String", "1.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<null>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<null>", "true"}, false, 0, null, 3), new String[][]{{"isNull", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:6>"}, false), new String[][]{{"valueToString", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:5>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"isNull", "", "4"}, {"asInt", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:6>"}, false), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:3>", "<s:a>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "serialize", "java.lang.Number,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:3>", "<sample:10>", "<sample:0>", "<sample:7>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<i:0>", "123456789012345678901234567890"}}, 1), new String[][]{{"withFilterId", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "handledType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false, 0, null, 3), new String[][]{{"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=0,shape=NUMBER_INT,lenient=false,locale=a_0_sample,timezone=a,features=EMPTY) {getLenient=false, getPattern=0, getShape=NUMBER_INT, hasLenient=true, hasLocale=true, hasPattern...#256#398018368", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "bigDecimalAsStringSerializer", new String[]{}, new String[]{}, true), new String[][]{{"withFilterId", "java.lang.Object", "7"}, {"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.math.BigDecimal {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.math.BigDecimal, getClasses=[], getConstructors=[public java.math.BigDecimal(java.lang.String), public ja...#750#-788082627", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"http://ewample.com/a?b=c", "false"}, false, 0, null, 1), new String[][]{{"booleanValue", "", "3"}, {"arrayNode", "", "7"}, {"addObject", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isE...#305#1333245466", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.NumberSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:2>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NumberSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.NumberSerializer", "com.fasterxml.jackson.databind.ser.std.NumberSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#321#-1750693622", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
