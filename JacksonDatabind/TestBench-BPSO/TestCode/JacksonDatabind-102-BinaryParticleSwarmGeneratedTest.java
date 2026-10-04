package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_asTimestamp", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean", "<sample:7>", "<sample:5>", "true"}}), new String[][]{{"findParents", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:9>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:2>", "<sample:7>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"getDelegatee", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:1>"}, false), new String[][]{{"serialize", "java.util.Calendar,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<sample:2>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:9>", "<sample:7>"}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "java.lang.Object", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "java.lang.Object", "<sample:1>"}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:1>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<sample:7>", "<sample:0>"}}, 2), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}, {"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}, {"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:12>", "<sample:6>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_timestamp", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:10>", "<null>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_timestamp", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:6>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<null>", "<null>", "-45"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=0,shape=SCALAR,lenient=null,locale=0,timezone=0) {getLenient=null, getPattern=0, getShape=SCALAR, hasLenient=false, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone...#223#455692548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"PT1H1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:3>", "<sample:6>", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"findValue", "java.lang.String", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:key>", "<null>", "<sample:6>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean", "<sample:2>", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"Ttle", "true"}, false, 0, null, 1), new String[][]{{"isInt", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:k3y>", "<sample:3>", "<sample:8>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_asTimestamp", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<sample:3>", "<i:-2147483648>", "\".25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "withFilterId", "java.lang.Object", "<s:5>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<null>", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:2>", "<sample:6>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:0>", "<i:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:6>", "<sample:4>", "<sample:2>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:1>", "<s:gey>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:7>", "<sample:2>", "<sample:3>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:3>", "<s:b>", "  b"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:12>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:10>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:10>", "<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=NON_DEFAULT,content=NON_DEFAULT,valueFilter=java.lang.Number.class,contentFilter=java.lang.Number.class) {getContentInclusion=NON_DEFAULT, getValueInclusion=NON_DEFAULT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:0>", "<sample:0>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:12>", "<sample:2>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<empty>", "<sample:5>", "<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:10>"}}, 3), new String[][]{{"isEmpty", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:5>", "<sample:4>", "<sample:9>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=ANY,lenient=null,locale=null,timezone=null) {getLenient=null, getPattern=, getShape=ANY, hasLenient=false, hasLocale=false, hasPattern=false, hasShape=false, hasTimeZon...#225#1310022306", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "true"}, false, 0, null, 2), new String[][]{{"isLong", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:1>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:5>", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:7>", "<sample:1>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<sample:2>", "<s:>", "j"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<null>", "<sample:0>", "<sample:7>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:2>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"withFilterId", "java.lang.Object", "3"}, {"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>", "<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:5>", "<sample:2>", "<sample:11>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"getValueInclusion", "", "7"}, {"withValueFilter", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=CUSTOM,content=ALWAYS,valueFilter=java.util.List.class,contentFilter=java.util.Map.class) {getContentInclusion=ALWAYS, getValueInclusion=CUSTOM}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:9>", "<sample:2>", "<sample:4>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:4>", "<sample:7>", "<sample:2>", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=NON_ABSENT,content=NON_EMPTY,valueFilter=java.lang.Integer.class,contentFilter=java.lang.Object.class) {getContentInclusion=NON_EMPTY, getValueInclusion=NON_ABSENT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:4>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "PT1HnBll", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<null>", "<sample:2>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:4>", "<sample:11>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:2>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:10>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:6>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<i:1>", "I"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<s:>", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:5>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:6>", "<null>", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:9>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "T"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"ntll"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:3>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"ntll\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1926307340", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<b:true>", "<i:-1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5f", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "--"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5f\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerN...#341#1833012289", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:10>", "<sample:3>", "<sample:1>", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}, {"decimalValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "2020-02-30T25:61:61 ", "true"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "1.1234567", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<null>", "<sample:10>", "<null>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=,shape=NUMBER,lenient=null,locale=sample,timezone=null) {getLenient=null, getPattern=, getShape=NUMBER, hasLenient=false, hasLocale=true, hasPattern=false, hasShape=true, hasT...#230#-2023132170", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:0>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:3>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<empty>", "<i:0>", "1.5300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<i:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findAnnotatedContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"<a>b</a>\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, is...#329#470343463", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:7>", "<empty>", "true"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:1>", "<sample:6>", "<sample:0>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:3>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:4>", "<sample:0>", "<s:=a>"}}), new String[][]{{"asInt", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:0>", "<sample:6>", "<sample:3>", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:3>", "<sample:8>", "<sample:1>", "<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:10>", "<sample:5>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<null>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:5>", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:4>", "<sample:8>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"TIXME", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"TIXME\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-839276073", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>", "<sample:0>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "usesObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:7>", "<s:a>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"--1"}, false), new String[][]{{"isArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_asTimestamp", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_timestamp", new String[]{"java.lang.Object"}, new String[]{"<s:b:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:1>", "<sample:3>", "<s:key>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:3>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:6>", "<sample:5>", "<sample:3>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:1>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "abc1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:5>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<null>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "handledType", ""}}), new String[][]{{"withFilterId", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatFeature", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:1>", "<sample:4>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "handledType", ""}}), new String[][]{{"isLong", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"010", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean", "<sample:4>", "<sample:6>", "true"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "<sample:4>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"010\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#196403339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:-1.5>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:5>", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-6>", "<sample:2>", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"Hllo, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:4>", "<sample:1>", "<b:true>", ""}}), new String[][]{{"has", "int", "6"}, {"doubleValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:7>", "<sample:0>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:5>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_timestamp", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<s:key>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:4>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-/.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:8>"}}), new String[][]{{"get", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:2>", "<s:>>", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=NON_NULL,content=NON_ABSENT,valueFilter=java.lang.Comparable.class,contentFilter=java.lang.Number.class) {getContentInclusion=NON_ABSENT, getValueInclusion=NON_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_timestamp", "java.lang.Object", "<i:2>"}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "nulm1.12345678", "false"}}), new String[][]{{"isLenient", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:0>", "<s:>", ""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.DOMSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{" "}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\" \"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#287863068", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_timestamp", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "<s:a>", "-t.5PT1H"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"false", "<sample:0>"}, false), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:a>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "java.lang.Object", "<s:ley>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"+1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-368972844", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:7>", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:8>"}}), new String[][]{{"serialize", "java.util.Calendar,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "withFilterId", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Value", actual.getClass().getName());
  assertEquals("JsonFormat.Value(pattern=0,shape=SCALAR,lenient=null,locale=0,timezone=0) {getLenient=null, getPattern=0, getShape=SCALAR, hasLenient=false, hasLocale=true, hasPattern=true, hasShape=true, hasTimeZone...#223#455692548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:0>", "<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<null>", "<sample:6>", "<sample:4>", "<sample:6>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"\na,b,c", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}}), new String[][]{{"isFloat", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"0", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}), new String[][]{{"asText", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:0>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"findValues", "java.lang.String", "1"}, {"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "withFilterId", "java.lang.Object", "<s:a>"}}), new String[][]{{"properties", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"hasTimeZone", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, false, 1, new String[][]{}), new String[][]{{"findPath", "java.lang.String", "6"}, {"findValue", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{" ", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_asTimestamp", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.530", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:3>", "<sample:1>", "<sample:2>"}}), new String[][]{{"isInt", "", "3"}, {"decimalValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.123456678", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:3>"}}), new String[][]{{"asBoolean", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean", "<sample:0>", "<sample:7>", "true"}}), new String[][]{{"handledType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:6>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:ke>", "<sample:7>", "<sample:9>"}}), new String[][]{{"getValueFilter", "", "2"}, {"getContentInclusion", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("ALWAYS", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:0>", "<sample:1>", "<i:0>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:6>"}, false), new String[][]{{"isEmpty", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 3, new String[][]{}), new String[][]{{"isObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0xEFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:4>"}}), new String[][]{{"findValues", "java.lang.String,java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<i:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:6>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:0>"}}), new String[][]{{"properties", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:2>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_timestamp", "java.lang.Object", "<s:>>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:0>", "<sample:0>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<sample:0>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ext.NioPathSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:8>", "<sample:0>"}, false), new String[][]{{"valueFor", "", "4"}, {"valueFor", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<empty>", "<sample:1>", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:6>", "<sample:2>", "<sample:2>"}}), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "java.lang.Object", "<s:Wb>"}}), new String[][]{{"getValueInclusion", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false), new String[][]{{"serialize", "java.util.Calendar,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:5>", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:-2147483648>", "<sample:6>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "1.5", "false"}}), new String[][]{{"getContentInclusion", "", "5"}, {"getValueInclusion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>", "<sample:2>", "<sample:3>"}}), new String[][]{{"withContentInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "0"}, {"getValueFilter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<b:false>", "<sample:5>", "<sample:3>", "<sample:1>"}}), new String[][]{{"withValueFilter", "java.lang.Class", "6"}, {"getContentFilter", "", "1"}, {"getContentFilter", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getDelegatee", ""}}), new String[][]{{"usesObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:6>", "<sample:3>"}, false), new String[][]{{"isBigInteger", "", "7"}, {"findValue", "java.lang.String", "5"}, {"isBigInteger", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:10>", "<sample:3>", "<s:{W>", "20"}}), new String[][]{{"findPath", "java.lang.String", "6"}, {"isFloat", "", "5"}, {"asInt", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<null>", "<sample:5>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:1>", "<sample:5>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}}), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.nio.file.Path {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.nio.file.Path, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], get...#623#1277205260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:0>", "<null>"}}, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<empty>", "<d:1.5>", ""}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:4>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<sample:2>", "<b:false>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_neitherNull", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-0.15>", "<s:kez>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>", "<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:3>", "<sample:1>", "<i:-18>"}}, 2), new String[][]{{"hasLenient", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"getContentFilter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"05d", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"05d\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNo...#340#1819655584", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:4>", "<sample:5>", "<sample:4>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", ".5--1"}}, 2), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "1E-5", "true"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:4>", "<sample:1>", "<i:-1>", "1.5300"}}), new String[][]{{"hasTimeZone", "", "7"}, {"getFeatures", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonFormat$Features", actual.getClass().getName());
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"number", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:7>", "<sample:8>", "<sample:5>"}}, 2), new String[][]{{"findValues", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 7, new String[][]{}, 1), new String[][]{{"isIntegralNumber", "", "5"}, {"fieldNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:4>", "<sample:8>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "<sample:0>"}}), new String[][]{{"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:9>", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<null>", "<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-32766>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isUnwrappingSerializer", ""}}), new String[][]{{"hasNonNull", "int", "4"}, {"findValues", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:2>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<sample:1>", "<s:a>", "1.1234567890223456"}}), new String[][]{{"isEmpty", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:7>", "<sample:7>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"a!", "true"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"a!\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#750845006", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:0>", "<i:2>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"01F", "true"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"01F\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoubl...#324#-1669405023", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:4>", "<i:2>", "<i:-1073741824>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<empty>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}}), new String[][]{{"serialize", "java.util.Calendar,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"s_tringI"}, false, 0, null, 3), new String[][]{{"asLong", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"-1.5", "false"}, false, 0, null, 3), new String[][]{{"isBoolean", "", "1"}, {"isBigDecimal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:4>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_serializeAsString", new String[]{"java.util.Date", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "withFormat", "java.lang.Boolean,java.text.DateFormat", "true", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:3>", "<sample:1>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:7>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findAnnotatedContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1d102020-01-01", "true"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1d102020-01-01\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=tr...#335#1837252444", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:0>", "<null>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "java.lang.Object", "<i:64>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_asTimestamp", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:3>", "<null>", "<sample:3>"}}, 2), new String[][]{{"asText", "java.lang.String", "2"}, {"floatValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:10>", "<null>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:5>", "<sample:1>", "<sample:4>"}}, 1), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, null, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "2"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"isNumber", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:10>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>"}}), new String[][]{{"findValue", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:8>", "<sample:4>", "<sample:3>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 7, new String[][]{}, 2), new String[][]{{"hasNonNull", "java.lang.String", "4"}, {"canConvertToLong", "", "5"}, {"findValuesAsText", "java.lang.String,java.util.List", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"n?mber", "false"}, false, 4, new String[][]{}, 1), new String[][]{{"isLong", "", "6"}, {"findParent", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:3>", "<sample:10>", "<sample:0>"}}, 1), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getDelegatee", ""}}), new String[][]{{"properties", "", "5"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findContextualConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:7>", "<b:true>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:3>", "<sample:5>", "<sample:6>", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:3>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findIncludeOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:4>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"Hel2o, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<s:jey>", "<s:keyB>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"Hel2o, World\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true...#333#1252845184", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:Ikdy>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean", "<sample:2>", "<sample:5>", "false"}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}}), new String[][]{{"getDelegatee", "", "0"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:5>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:3>"}}), new String[][]{{"floatValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<null>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String", "PT1\nH "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"+1", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:2>", "<sample:4>", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:1>", "<sample:0>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"+1\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-368972844", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:5>", "<s:jey>", "<s:key>"}}, 3), new String[][]{{"getValueFilter", "", "7"}, {"valueFor", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:3>"}}), new String[][]{{"valueFor", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonFormat {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonFormat, getClasses=[class com.fasterxml.jackson...#873#-766877138", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:_>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:7>", "<sample:2>", "<sample:7>"}}), new String[][]{{"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getDelegatee", ""}}, 3), new String[][]{{"getPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isUnwrappingSerializer", ""}}), new String[][]{{"getPattern", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findIncludeOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:a>", "<sample:0>", "<sample:9>", "<sample:6>"}}, 1), new String[][]{{"getContentFilter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<null>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "htsp://example.com/a?b=ctrue", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "_nonEmpty", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:13>", "<s:aD>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:9>", "<s:a>", "<s:k_ey>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}, {"floatValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "handledType", ""}}), new String[][]{{"handledType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"hasLocale", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:3>", "<sample:3>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}), new String[][]{{"getTimeZone", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:2>", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:4>", "<null>"}}, 2), new String[][]{{"serialize", "java.util.Calendar,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findContextualConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:2>", "<sample:1>"}}), new String[][]{{"getDelegatee", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"number\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#-1980391369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "handledType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:7>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,boolean", "<sample:5>", "<sample:0>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=f...#321#-1363097938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:e>", "<sample:1>", "<sample:0>", "<sample:3>"}}, 1), new String[][]{{"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:a>", "<sample:2>", "<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:10>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "findFormatOverrides", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class"}, new String[]{"<sample:0>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "usesObjectId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitFloatFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<null>", "<sample:7>", "<sample:0>"}}, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"arrayNode", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "handledType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:9>", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:8>"}}, 3), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}, {"handledType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<null>", "<sample:4>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isEmpty", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "properties", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<empty>", "<i:1>", "61>.5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "createSchemaNode", "java.lang.String,boolean", "abc", "false"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:2>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "2"}, {"asToken", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"tru"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_timestamp", "java.lang.Object", "<s:pb>"}}, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "withFormat", new String[]{"java.lang.Boolean", "java.text.DateFormat"}, new String[]{"true", "<sample:0>"}, false, 3, new String[][]{}), new String[][]{{"getDelegatee", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:1>", "<i:0>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.Calendar {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Calendar, getClasses=[class java.util.Calendar$Builder], getConstructors=[], getDeclaredAnnotations=[]...#769#-2113856336", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "com.fasterxml.jackson.databind.ser.std.CalendarSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1H", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase", "_serializeAsString", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:2>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"PT1H\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#1825913961", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
