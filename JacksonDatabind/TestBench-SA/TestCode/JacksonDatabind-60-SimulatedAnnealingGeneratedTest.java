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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<null>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2147483648>", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}, 2), new String[][]{{"properties", "", "0"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:a>", "<sample:5>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:2>", "<sample:0>", "<sample:2>", "<sample:5>"}}, 1), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<null>", "<sample:6>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:*(>", "<sample:6>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<null>", "<null>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:*(>", "<sample:6>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:0>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"any\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#1860732200", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:5*(>", "<sample:8>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:0>"}}, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"findValuesAsText", "java.lang.String", "6"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:13>", "<null>", "true"}, false, 9, new String[][]{}, 1), new String[][]{{"getDelegatee", "", "6"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:5>", "<sample:7>", "<sample:5>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:7>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<null>", "<null>", "<i:2>", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:6>", "<sample:7>", "<sample:1>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:6>", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=SCALAR,locale=0,timezone=0] {getPattern=0, getShape=SCALAR, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 1), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:0>", "<sample:3>"}}, 2), new String[][]{{"isUnwrappingSerializer", "", "3"}, {"withFilterId", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:0>", "<sample:3>"}}, 2), new String[][]{{"isUnwrappingSerializer", "", "3"}, {"withFilterId", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:0>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2), new String[][]{{"isUnwrappingSerializer", "", "5"}, {"isEmpty", "java.lang.Object", "7"}, {"withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "7"}, {"properties", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2), new String[][]{{"isUnwrappingSerializer", "", "5"}, {"isEmpty", "java.lang.Object", "7"}, {"withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:1>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String,boolean", " ", "true"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String,boolean", " ", "true"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<s:a>", "<sample:1>"}}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<s:a>", "<sample:1>"}}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", ""}}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<empty>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:8>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:1>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:1>", "<null>", "PT1H"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2147483648>", "<null>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<empty>", "<null>", "PT1H"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2147483648>", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"properties", "", "0"}, {"hasNext", "", "5"}, {"hasNext", "", "5"}, {"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:2>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:2>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0xFFFFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#-2017615690", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0xFFFbFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0xFFFbFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#789521310", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x(FFbFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x(FFbFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-169946240", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"i\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1608261019", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 3), new String[][]{{"isFloat", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\".5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-5556939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#1660316756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:1>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1493135823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<null>", "<null>", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"6"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:1>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"6\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1577945294", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:0>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:7>", "<s:key>", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<i:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:5>", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:3>", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", ""}}, 3), new String[][]{{"getDelegatee", "", "2"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "5"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:4>", "<s:a>"}}, 3), new String[][]{{"getDelegatee", "", "2"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-01-01", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2020-01-01\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#-1230333169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false, 1, new String[][]{}, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:5>", "<b:true>", "<i:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:b>", "<sample:1>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2>", "<sample:9>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<b:true>", "<s:key>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:b>", "<sample:1>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2>", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:b>", "<sample:0>", "<sample:2>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<d:1.5>", "<i:-96>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:3>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-1>", "<sample:8>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{" ", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\" \"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#287863068", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"--1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#1730602701", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:bkey>", "<sample:8>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:9>", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:2>", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:4>", "<sample:5>", "<i:-40>", ""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<sample:4>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<sample:4>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<null>", "<d:0.15>", "y5."}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<d:-2.915>", ""}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", "<b:true>", "2020-02.30T25:6:61"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:7>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:0>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:10>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}}, 3), new String[][]{{"withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<null>", "<sample:4>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:1>", "<sample:2>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<sample:4>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:1>", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:10>", "<empty>", "<s:a>", "{\"a\":1}"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:8>", "<sample:2>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<null>", "<null>", "<s:a>", "-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<null>", "<empty>", "<s:a>", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:2>", "<sample:5>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<sample:2>", "<s:b>", "1"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:2>", "<sample:2>", "<s:b>", "-1"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:4>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:0>", "<s:>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:b>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<sample:4>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x123456789\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#898672681", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/x123456789"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/x123456789\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true,...#332#-1203155864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/x12456789"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/x12456789\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#1552736891", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"/xA2456789"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"/xA2456789\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, ...#331#922689643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-929785251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"a"}, false), new String[][]{{"findParents", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:7>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:7>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:6>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.CoreXMLSerializers$XMLGregorianCalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:6>", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:7>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method interface java.util.List#get)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:G>"}}), new String[][]{{"isUnwrappingSerializer", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:4>", "<sample:0>", "<sample:2>"}}), new String[][]{{"isUnwrappingSerializer", "", "3"}, {"withFilterId", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:0>", "<sample:3>"}}), new String[][]{{"isUnwrappingSerializer", "", "3"}, {"withFilterId", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:0>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<null>", "<sample:4>", "<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:7>", "<sample:7>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String,boolean", " ", "true"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:4>", "<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:10>", "<b:true>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:9>", "<b:false>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}}), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:4>", "<sample:7>", "<sample:4>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<empty>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:10>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:10>", "<s:key>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:10>", "<sample:2>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}), new String[][]{{"properties", "", "0"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}), new String[][]{{"properties", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<sample:3>", "<s:a>", "5."}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<null>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"+1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-368972844", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{")", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\")\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#1044331146", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "java.lang.Object", "<s:kk-y>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:key>", "<sample:6>", "<sample:10>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<d:1.5>", "<null>", "<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:4>", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:3>", "<null>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}), new String[][]{{"getDelegatee", "", "2"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "5"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:6>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}}), new String[][]{{"getDelegatee", "", "2"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-01-01", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2020-01-01\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#-1230333169", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-01-01", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>"}}), new String[][]{{"booleanValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-01-01", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>"}}), new String[][]{{"at", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1}", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"{\\\"a\\\":1}\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isConta...#346#474629121", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1}", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String", "a b"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:3>"}}), new String[][]{{"findValue", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:0>", "<null>", "<sample:4>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:0>", "<null>", "<sample:4>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#616617116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "java.lang.Object", "<b:true>"}}), new String[][]{{"isUnwrappingSerializer", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:6>", "<null>", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isB...#367#1251876147", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:2>"}, false), new String[][]{{"getNodeType", "", "2"}, {"findValuesAsText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"010"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"010\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#196403339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", ""}}), new String[][]{{"isBoolean", "", "3"}, {"fieldNames", "", "1"}, {"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_EMPTY,content=NON_EMPTY] {getContentInclusion=NON_EMPTY, getValueInclusion=NON_EMPTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:6>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:3>", "<s:>", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:1>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_ABSENT,content=NON_EMPTY] {getContentInclusion=NON_EMPTY, getValueInclusion=NON_ABSENT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:2>", "true"}, false), new String[][]{{"arrayNode", "int", "6"}, {"add", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[\"a\"] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, is...#313#-1063498362", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<empty>", "<i:1>", "PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<i:-47>", "PT1I1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<sample:1>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}), new String[][]{{"asDouble", "double", "3"}, {"isDouble", "", "3"}, {"isBinary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:5>"}}), new String[][]{{"asDouble", "double", "3"}, {"isDouble", "", "3"}, {"isBinary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>", "<sample:6>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>", "<sample:6>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:1>", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<null>", "<empty>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=0,shape=NUMBER_INT,locale=a_0_sample,timezone=a] {getPattern=0, getShape=NUMBER_INT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<sample:0>", "0"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<sample:0>", "0"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<empty>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}), new String[][]{{"canConvertToLong", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, false), new String[][]{{"fields", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"isMissingNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:1>", "<s:a>", "()"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"isMissingNode", "", "6"}, {"asText", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:c>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:1>", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:8>", "<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:c>", "<sample:3>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:c>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:6>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:c>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:6>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:6>", "<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:5>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:7>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:3>", "<b:true>", "<a>b</a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:2>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:5>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:4>", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}), new String[][]{{"getContentInclusion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:1>", "<sample:3>", "<i:-1>", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<sample:10>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:7>"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:2>", "<sample:0>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>", "<sample:3>"}, false), new String[][]{{"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_NULL,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:a>", "<sample:7>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isNaturalTypeWithStdHandling", "java.lang.Class,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:8>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"withFilterId", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:2>", "<sample:1>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>", "<sample:7>", "<sample:10>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:5>", "<sample:4>"}}), new String[][]{{"timeZoneAsString", "", "4"}, {"hasTimeZone", "", "0"}, {"withPattern", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=NUMBER_FLOAT,locale=sample,timezone=null] {getPattern=sample, getShape=NUMBER_FLOAT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<b:true>", "<sample:5>", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:0>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:10>", "<sample:5>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<b:true>", "<sample:6>", "<null>", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:10>", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:4>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:5>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<null>", "<i:1>", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<null>", "<i:1>", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:10>", "<i:2>", "<s:b>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:4>", "<sample:7>", "<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:3>", "<sample:2>", "<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false), new String[][]{{"isUnwrappingSerializer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 10, new String[][]{}), new String[][]{{"isUnwrappingSerializer", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=BOOLEAN,locale=sample,timezone=sample] {getPattern=, getShape=BOOLEAN, hasLocale=true, hasPattern=false, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false), new String[][]{{"hasTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=,shape=BOOLEAN,locale=sample,timezone=sample] {getPattern=, getShape=BOOLEAN, hasLocale=true, hasPattern=false, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"hasTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 1, new String[][]{}, 3), new String[][]{{"hasTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String,boolean", "0x1F", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", "java.lang.String,boolean", "11F", "false"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:3>", "<null>", "<s:key>", "10"}}, 3), new String[][]{{"hasTimeZone", "", "1"}, {"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:2>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:1>", "<b:true>", "10"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<s:key>", "10"}}, 3), new String[][]{{"hasTimeZone", "", "1"}, {"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=OBJECT,locale=a,timezone=0] {getPattern=sample, getShape=OBJECT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:2>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:1>", "<b:true>", "10"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<s:key>", "10"}}), new String[][]{{"hasTimeZone", "", "1"}, {"getFeature", "com.fasterxml.jackson.annotation.JsonFormat$Feature", "0"}, {"withOverrides", "com.fasterxml.jackson.annotation.JsonFormat$Value", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("[pattern=sample,shape=OBJECT,locale=a,timezone=0] {getPattern=sample, getShape=OBJECT, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:1>", "<b:true>", "10"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<null>"}}), new String[][]{{"binaryNode", "byte[],int,int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false, isF...#312#1852476946", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:5>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:7>", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:6>", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:7>", "<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:7>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false), new String[][]{{"withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "5"}, {"getDelegatee", "", "4"}, {"handledType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:4>", "<empty>", "<i:2>", "0x123456789"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:3>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:10>", "<sample:0>", "<s:key>", "#"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:2>", "<null>"}}), new String[][]{{"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:10>", "<sample:0>", "<s:key>", "#"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:2>", "<null>"}}), new String[][]{{"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:key/>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:10>", "<sample:0>", "<s:key>", "#"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<sample:2>", "<null>"}}), new String[][]{{"properties", "", "6"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, null, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:6>"}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:10>", "<sample:0>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:0>"}}), new String[][]{{"arrayNode", "", "6"}, {"booleanNode", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:4>", "<sample:4>"}}, 1), new String[][]{{"getContentInclusion", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"6.nulm", "false"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:2>", "<sample:1>", "true"}}, 3), new String[][]{{"intValue", "", "4"}, {"floatValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"6.nulm", "false"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:2>", "<sample:1>", "true"}}), new String[][]{{"intValue", "", "4"}, {"floatValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"6.nulm", "false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:2>", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:10>", "<sample:6>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"6.nulm\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1310414189", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"6.nulm\n", "true"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", "com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer,boolean", "<sample:2>", "<sample:1>", "false"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:10>", "<sample:6>", "<null>"}}, 1), new String[][]{{"fields", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<null>", "<b:true>", ".5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isEmpty", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 3), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "properties", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "handledType", ""}}), new String[][]{{"canConvertToInt", "", "2"}, {"asLong", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false), new String[][]{{"isEmpty", "java.lang.Object", "6"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"fields", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedEntryIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.lang.String#format) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, false), new String[][]{{"isEmpty", "java.lang.Object", "6"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"fields", "", "6"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false"}, false), new String[][]{{"isEmpty", "java.lang.Object", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "true"}, false, 15, new String[][]{}), new String[][]{{"isEmpty", "java.lang.Object", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<null>", "<sample:9>", "true"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withFilterId", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"isEmpty", "java.lang.Object", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "withResolved", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer", "boolean"}, new String[]{"<sample:5>", "<sample:8>", "true"}, false, 15, new String[][]{}, 3), new String[][]{{"isEmpty", "java.lang.Object", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", actual.getClass().getName());
  assertEquals("(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method class java.util.Arrays#asList) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:2>", "<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:8>"}}, 2), new String[][]{{"asText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"asText", "java.lang.String", "0"}, {"findValuesAsText", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(@JsonValue serializer for method interface java.util.List#get) {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:2>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "_acceptJsonFormatVisitorForEnum", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:5>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "usesObjectId", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<null>", "<sample:1>", "<i:2>", "+1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:4>", "<sample:1>", "<s:a>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<sample:3>", "<s:c>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.JsonValueSerializer", "isUnwrappingSerializer", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
}
