package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:5>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "9 E>>PT1H"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "hasSomeOfFeatures", "int", "-1"}}), new String[][]{{"printStackTrace", "java.io.PrintStream", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: 9 E>>PT1H\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] {getLocalizedMessage=Unexpected token...#513#946435571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "isFactoryMethod", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getBeanClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_intOverflow", new String[]{"long"}, new String[]{"4"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", ">"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleUnexpectedToken", "java.lang.Class,com.fasterxml.jackson.core.JsonParser", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.DatabindContext", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "constructCalendar", "java.util.Date", "<sample:4>"}}), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_ARRAY: >\n at [Source: UNKNOWN; line: 1, column: 0] (through reference chain: java.lang.Integer[\"0\"]) ...#563#-2128266109", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "g"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "parseDate", "java.lang.String", "problem: (%s) %s"}, {"com.fasterxml.jackson.databind.DeserializationContext", "handleUnexpectedToken", "java.lang.Class,com.fasterxml.jackson.core.JsonParser", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<i:2>", "12:0:45", "<sample:2>"}}), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: g\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] (through reference chain: java.lang.Integer[\"...#569#404139353", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:7>", "<sample:2>", ""}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "parseDate", "java.lang.String", "problem: (%s) %s"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<i:2>", "12:0:45", "<sample:2>"}}), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: \n at [Source: UNKNOWN; line: 1, column: -1] (through reference chain: java.lang.Integer[\"0\"])...#564#565374461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_nonNullNumber", new String[]{"java.lang.Number"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "includeFilterSuppressNulls", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "invalidTypeIdException", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String", "<sample:5>", "\t", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{">0x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:2>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{">0x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:2>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceNullToken", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"Unsuitabl:e method (0.75 "}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_shortOverflow", "int", "13"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"!"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_shortOverflow", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:6>", "<sample:6>", "<sample:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>", "<sample:6>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "findNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getNullValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseFloatPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", " "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#314#-1345823777", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:2>", "<sample:7>", "<sample:6>", "<sample:6>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:6>", "2.0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "flushCachedSerializers", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getDefaultNullKeySerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:5>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:1>", "<sample:0>", "<null>", "<sample:2>"}}, 3), new String[][]{{"getObjectIdReader", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "returnObjectBuffer", new String[]{"com.fasterxml.jackson.databind.util.ObjectBuffer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:4>", "a b"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportWrongTokenException", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonToken,java.lang.String,java.lang.Object[]", "<sample:2>", "<sample:0>", "\"%s\"", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:0>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "assignIndex", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "hasViews", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#256#-1461936970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:5>", "<sample:8>", "<sample:4>", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:7>", "<sample:7>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findDeserializationConverter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findClassDescription", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:4>"}}), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:4>"}}), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromLongCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=true, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1101176383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<null>", "<sample:5>", "<null>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "leaseObjectBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleWeirdNativeValue", "com.fasterxml.jackson.databind.JavaType,java.lang.Object,com.fasterxml.jackson.core.JsonParser", "<sample:1>", "<s:>", "<sample:2>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "endOfInputException", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ObjectBuffer", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getFactory", new String[]{}, new String[]{}, false), new String[][]{{"withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<null>", "<sample:7>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapException", "java.lang.Throwable", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#322#180656140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`generated.algorithm.SearchInputFactory_scaffolding$TypeSamples`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#2066247587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`generated.algorithm.SearchInputFactory_scaffolding$TypeSamples`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#2066247587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`int`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#302#-2142709686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#301#695670600", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "<sample:1>", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java.util.Navigabledet"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#303#-1992659196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "mappingException", new String[]{"java.lang.Throwable", "java.lang.String", "java.lang.Object[]"}, new String[]{"<empty>", "07java.util.Deque1.1234567890123456", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "false", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 07java.util.Deque1.1234567890123456 {getLocalizedMessage=07java.util.Deque1.1234567890123456, getMessage=07java.util.Deque1.1234567890123456, getOr...#365#-1773454954", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findPOJOBuilderConfig", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java.util.Nvigabledet"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateCreator", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "_createFromStringFallbacks", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "0.75"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#334#881158522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromObjectWith", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object[]", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getFromObjectArguments", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>", "<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:6>", ".N>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "_truncate", "java.lang.String", "Not a subtype"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportBadPropertyDefinition", "com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.String,java.lang.Object[]", "<sample:7>", "<sample:3>", "problem: (%s) %s", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getActiveView", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<null>", "0N>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.JavaType,java.util.concurrent.atomic.AtomicReference", "<sample:8>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getActiveView", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:3>", "0N>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_findNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.annotation.Nulls", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:5>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "findContextualValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonDeserializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "resolveSubType", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:3>", "0N>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "set", new String[]{"java.lang.Object", "java.lang.Object", "java.lang.Object"}, new String[]{"<s:key>", "<i:1>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object,java.lang.Object", "<sample:1>", "<sample:1>", "<i:-2147483648>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 11, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:6>", "<sample:3>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map", "<sample:6>", "<sample:1>", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<i:-2147483648>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:6>", "<sample:6>", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map", "<sample:0>", "<sample:7>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:15>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:6>", "<sample:7>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map", "<sample:3>", "<sample:8>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "deserializeWith", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:7>", "<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsFailProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=DYNAMIC}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleMissingInstantiator", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.deser.ValueInstantiator", "com.fasterxml.jackson.core.JsonParser", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:2>", "<sample:1>", "<sample:4>", "010", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "setAttribute", "java.lang.Object,java.lang.Object", "<i:2>", "<i:-2>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportMappingException", "java.lang.String,java.lang.Object[]", "1.5d", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "findInjectableValue", "java.lang.Object,com.fasterxml.jackson.databind.BeanProperty,java.lang.Object", "<s:>", "<sample:5>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Cannot deserialize instance of `java.lang.String` out of VALUE_EMBEDDED_OBJECT token {getLocalizedMessage=Cannot deserialize instance of `java.lang...#495#-1705264368", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getIgnoredPropertyNames", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=true, isNonStaticInnerClass=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:14>", "<sample:5>", "<null>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:6>", "<sample:1>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findFormatOverrides", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<null>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseIntPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "12:30:45"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getEmptyAccessPattern", ""}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_shortOverflow", "int", "2147483647"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "isDefaultKeyDeserializer", "com.fasterxml.jackson.databind.KeyDeserializer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-1", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "emptyIterator", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-27", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "cachedSerializersCount", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializerInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:7>", "<i:-19>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"2", "<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "reportMappingProblem", "java.lang.Throwable,java.lang.String,java.lang.Object[]", "<sample:0>", "Unsuitable method (", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"124", "<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<empty>", "<null>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"4503599627369496", "<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "reportMappingProblem", "java.lang.String,java.lang.Object[]", "2020-01-01", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"9007199254738992", "<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "defaultSerializeDateValue", "long,com.fasterxml.jackson.core.JsonGenerator", "1001", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromDoubleCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateFromDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=true, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#1988385727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromObjectSettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:1>", "<sample:1>", "<sample:15>", "<sample:2>", "<sample:5>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "wrapAsJsonMappingException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<null>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=true, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#295#-1741164875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "prependPath", new String[]{"java.lang.Object", "int"}, new String[]{"<sample:0>", "10"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JsonMappingException", "getPathReference", "java.lang.StringBuilder", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: sample\n at [Source: UNKNOWN; line: 1, column: 5] (through reference chain: java.lang.String[10]) {getLocalizedMessage=sample\n at [Source: UNKNOWN; ...#471#-258040229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"488", "<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:9>", "<i:-19>", "<sample:4>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:15>", "false", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"-2305843009213693953", "<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_dateFormat", ""}, {"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:14>", "false", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructSetterlessProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:4>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"124", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "getFilterProvider", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:14>", "false", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper"}, new String[]{"<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getArrayDelegateCreator", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"1152956688978935814", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:12>", "true", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:4>", "true", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeDateKey", new String[]{"long", "com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"0", "<sample:8>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findPrimaryPropertySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findTypedValueSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.BeanProperty", "<sample:12>", "true", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "isCollectionMapOrArray", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getActiveView", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "includeFilterSuppressNulls", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:5>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportInputMismatch", new String[]{"com.fasterxml.jackson.databind.BeanProperty", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:5>", "-1", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:13>", "<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.Object, $0 -> $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0$0>;, getTypeName=[map type; class java.lang.Object, $0 -> $0], hasContentT...#453#-1819256053", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "constructSpecializedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "weirdStringException", "java.lang.String,java.lang.Class,java.lang.String", "", "<sample:2>", "{\"a\":1}"}, {"com.fasterxml.jackson.databind.DeserializationContext", "instantiationException", "java.lang.Class,java.lang.String", "<empty>", "N/A"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasContentType=false, hasGeneri...#435#1283031983", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getValueClass", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleSecondaryContextualization", new String[]{"com.fasterxml.jackson.databind.JsonDeserializer", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>", "<sample:13>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", ""}}, 2), new String[][]{{"flushCachedDeserializers", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "1.5"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:7>", "<null>", "<i:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "buildThrowableDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:13>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:8>", "<sample:6>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseBooleanPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromBooleanCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>", "<sample:15>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:7>", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:4>", "<sample:18>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:13>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:0>", "<sample:15>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:7>", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>", "<sample:21>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findContentNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_deserializeFromEmpty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:6>", "<sample:11>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:3>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:4>", "<sample:21>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:21>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "mappingException", "java.lang.String,java.lang.Object[]", "Unsuitabl:e method (0.75 ", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:3>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:7>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>", "<sample:21>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:22>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getFullName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "visibleInView", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "getFullName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("sample {getNamespace=null, getSimpleName=sample, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addInjectables", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:1>", "<sample:2>", "<i:-1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getDefaultPropertyInclusion", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "reportBadPropertyDefinition", "com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.String,java.lang.Object[]", "<sample:6>", "<sample:0>", "1.1234567890123456", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:12>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "hasSerializerFor", "java.lang.Class,java.util.concurrent.atomic.AtomicReference", "<sample:2>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyNullForPrimitiveCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "@JsonUnwrapped"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findValueNullProvider", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.SettableBeanProperty,com.fasterxml.jackson.databind.PropertyMetadata", "<sample:0>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getObjectIdReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:9>", "<sample:8>", "<sample:4>", "<sample:6>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructAnySetter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addObjectIdReader", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "<sample:7>", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:1>", "<sample:8>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:0>", "<sample:0>", "<sample:4>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitAnyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:2>", "<sample:7>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:0>", "<sample:8>", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "quotedOr", new String[]{"java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "0x123456789"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getDeclaringClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "toString", ""}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "getWrapperName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id 'key'] {getCreatorIndex=12, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=fals...#256#-1461936970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "converterInstance", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.DatabindContext", "constructType", "java.lang.reflect.Type", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: Cannot deserialize instance of `generated.algorithm.SearchInputFactory_scaffolding$GenericSub` out of null token\n at [Source: UNKNOWN; line: 1, col...#565#1275442598", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[any property on class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[any property on class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {hasValueDeserializer=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[any property on class java.lang.String]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[any property on class java.lang.String] {hasValueDeserializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findKeyDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdKeyException", new String[]{"java.lang.Class", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "12:30:55", "Argument #"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize Map key of type `java.lang.String[]` from String \"12:30:55\": Argument #\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] {get...#553#-1372704732", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "java.lang.Class", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:15>", "<sample:5>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "_truncate", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected FIELD_NAME\n at [Source: UNKNOWN; line: 1, column: 0] {getLocalizedMessage=Unexpected token (null), expect...#487#1591536951", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findValueSerializer", "java.lang.Class", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<null>", "<sample:3>", "<sample:9>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:6>", "<s:>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "handleSecondaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_createAndCacheUntypedSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "readResolve", ""}, {"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "getType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<s:jex>", "<sample:19>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:1>", "<s:a>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:13>", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<s:iex>", "<sample:19>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "defaultSerializeValue", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator", "<s:key>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializeValue", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object", "<sample:13>", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>", "<sample:5>", "<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addBeanProps", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "<sample:5>", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<s:i.ex>", "<sample:10>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findTypeSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getDefaultNullKeySerializer", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<i:-4194215>", "<sample:24>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getDefaultNullKeySerializer", ""}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>", "<i:-4194215>", "<sample:25>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String,java.lang.Throwable", "<sample:6>", "0", "<empty>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportWrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "<sample:7>", "123456789012345678901234567890", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:13>", "<b:true>", "<sample:3>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "includeFilterInstance", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "findObjectId", "java.lang.Object,com.fasterxml.jackson.annotation.ObjectIdGenerator", "<i:-36>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_failDoubleToIntCoercion", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "<sample:2>", "Unsuitabl:e method (0.75 "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableAnyProperty", "com.fasterxml.jackson.databind.deser.SettableAnyProperty", "hasValueDeserializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.SettableAnyProperty", "_throwAsIOE", "java.lang.Exception,java.lang.Object,java.lang.Object", "<sample:3>", "<b:false>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "findPOJOBuilder", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<i:-2147483648>", "<sample:0>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "includeFilterInstance", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:11>", "<null>", "<sample:0>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "includeFilterInstance", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "from", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "java.lang.Throwable"}, new String[]{"<sample:9>", "[]", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: [] {getLocalizedMessage=[], getMessage=[], getOriginalMessage=[], getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMappingExcep...#233#-161344944", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "reportUnresolvedObjectId", new String[]{"com.fasterxml.jackson.databind.deser.impl.ObjectIdReader", "java.lang.Object"}, new String[]{"<sample:1>", "<s:iex>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleWeirdNumberValue", "java.lang.Class,java.lang.Number,java.lang.String,java.lang.Object[]", "<sample:1>", "<i:0>", "Title", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addReferenceProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "throwAsMappingException", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.io.IOException"}, new String[]{"<sample:6>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializeValue", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "<s:[e+UK>", "<sample:10>", "<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "includeFilterInstance", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "_reportIncompatibleRootType", "java.lang.Object,com.fasterxml.jackson.databind.JavaType", "<s:>", "<sample:14>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getDeclaringClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "getClassDescription", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`java.lang.Integer`", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "weirdNativeValueException", new String[]{"java.lang.Object", "java.lang.Class"}, new String[]{"<null>", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.lang.String[]` from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type [null]: incompatible type...#559#-2040844073", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "withSimpleName", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.CreatorProperty", actual.getClass().getName());
  assertEquals("[creator property, name ' '; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName= , getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false...#255#-948182362", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_findPropertyFields", new String[]{"java.util.Collection", "boolean"}, new String[]{"<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "getPath", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JsonMappingException", "prependPath", "java.lang.Object,java.lang.String", "<s:jex>", "12:30:55"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableList", actual.getClass().getName());
  assertEquals("[java.lang.String[\"12:30:55\"]]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: a (through reference chain: java.lang.String[\"12:30:55\"]) {getLocalizedMessage=a (through reference chain: java.lang.String[\"12:30:55\"]), getMessag...#425#1587608608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "unwrappingDeserializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDoublePrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findContentNullStyle", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "getPath", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: a {getLocalizedMessage=a, getMessage=a, getOriginalMessage=a, getPathReference=, getStackTrace=[java.base/jdk.internal.reflect.NativeConstructorAcc...#229#975458364", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "getPath", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException:  {getLocalizedMessage=, getMessage=, getOriginalMessage=, getPathReference=, getStackTrace=[java.base/jdk.internal.reflect.NativeConstructorAccesso...#225#242140344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "getPath", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: a\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=a\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=a\n at [Source: UNKNOWN; li...#355#1851684357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getObjectIdReader", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_nonNullNumber", "java.lang.Number", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getValueType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getInjectableValueId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "getContextAnnotation", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "findPropertyFormat", "com.fasterxml.jackson.databind.cfg.MapperConfig,java.lang.Class", "<sample:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "findSuperTypes", new String[]{"java.lang.Class", "java.lang.Class", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:3>"}, false), new String[][]{{"createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_deserializeWrappedValue", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "isDefaultDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseLongPrimitive", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "isRequired", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "withValueDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=10, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fal...#257#-198467282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "prependPath", new String[]{"com.fasterxml.jackson.databind.JsonMappingException$Reference"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JsonMappingException", "getPathReference", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "com.fasterxml.jackson.databind.JsonMappingException: sample\n at [Source: UNKNOWN; line: 1, column: 5] (through reference chain: UNKNOWN[?]) {getLocalizedMessage=sample\n at [Source: UNKNOWN; line: 1, c...#451#1943468173", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "defaultValue", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyNullForPrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceEmptyString", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseString", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "endOfInputException", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected end-of-input when trying to deserialize a java.lang.Object {getLocalizedMessage=Unexpected end-of-input when trying to deseriali...#488#-1048985489", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:2>", "<sample:11>", "<sample:7>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "converterInstance", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<null>", "<b:true>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "reportBadPropertyDefinition", "com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.String,java.lang.Object[]", "<null>", "<sample:6>", "", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Throwable", "<sample:21>", "1E-5", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_weirdKey", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,java.lang.Exception", "<sample:4>", "java.util.Deque", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getDefaultNullValueSerializer", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultPropertyInclusion", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.NullSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:19>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_reportUnwrappedCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:2>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "buildBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:25>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:9>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasAbstractTypeResolvers=true, hasDeserializerModifiers=true, hasDeserializers=true, hasKeyDeserializers=true, hasValueInstantiators=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "materializeAbstractType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:21>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "buildBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:23>", "<sample:8>"}}, 3), new String[][]{{"deserializers", "", "2"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "getPropertyDefaultValue", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"0", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.PropertyBuilder", "getClassAnnotations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "serializePolymorphic", "com.fasterxml.jackson.core.JsonGenerator,java.lang.Object,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>", "<s:jex>", "<sample:2>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<sample:2>"}}), new String[][]{{"constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "6"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseBooleanFromInt", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "findFormatFeature", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class,com.fasterxml.jackson.annotation.JsonFormat$Feature", "<sample:7>", "<sample:7>", "<empty>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:3>"}}, 1), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "setNullValueSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:3>"}}), new String[][]{{"constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "getLocale", ""}, {"com.fasterxml.jackson.databind.SerializerProvider", "findKeySerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:2>"}}), new String[][]{{"constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:0>", "<sample:4>"}}), new String[][]{{"constructCollectionLikeType", "java.lang.Class,java.lang.Class", "1"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class int, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]] {getErasedSignature=I, getGenericSignature=I<Lgenerated/algorithm/Search...#573#-1966598473", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "defaultSerializeNull", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getSerializationView", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<i:1>", " of constructor "}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: 0 (through reference chain: java.lang.Integer[\" of constructor \"]) {getLocalizedMessage=0 (through reference chain: java.lang.Integer[\" of construc...#453#1161871215", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "objectIdGeneratorInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "isEnabled", new String[]{"com.fasterxml.jackson.databind.DeserializationFeature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "constructType", "java.lang.reflect.Type", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "findValueNullProvider", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.PropertyMetadata"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getEmptyAccessPattern", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider", actual.getClass().getName());
  assertEquals("{getNullAccessPattern=ALWAYS_NULL}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "serializePolymorphic", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.lang.Object", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:7>", "<i:2>", "<sample:6>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_byteOverflow", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "missingTypeIdException", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String"}, new String[]{"<sample:18>", ": "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportTrailingTokens", "java.lang.Class,com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.JsonToken", "<null>", "<null>", "<sample:3>"}}), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "6"}, {"getPathReference", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String[\"sample\"]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "handlePrimaryContextualization", "com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:0>"}}, 1), new String[][]{{"constructRawCollectionLikeType", "java.lang.Class", "6"}, {"withContentTypeHandler", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List<Ljava/lang/Object;>;, getTypeName=[col...#521#123636820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNegInf", new String[]{"java.lang.String"}, new String[]{"Unsuitable method ("}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseIntPrimitive", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingDefault", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "verifyMustOverride", new String[]{"java.lang.Class", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:10>", "<s:iex>", "{\"a\":1}"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getTypeFactory", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "generateJsonSchema", "java.lang.Class", "<sample:10>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "defaultSerializeDateKey", "java.util.Date,com.fasterxml.jackson.core.JsonGenerator", "<empty>", "<sample:8>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_findExplicitUntypedSerializer", "java.lang.Class", "<sample:3>"}}), new String[][]{{"constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "6"}, {"getErasedSignature", "", "4"}, {"withContentType", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class java.lang.Object]] {getErasedSignature=[Ljava/lang/Object;, getGenericSignature=[Ljava/lang/Object;, getTypeName=[array type, component type: [simple t...#489#-1538854792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "wrapperType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"TITLE", "<sample:10>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "mappingException", new String[]{"java.lang.String"}, new String[]{"\"%s\""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleMissingInstantiator", "java.lang.Class,com.fasterxml.jackson.databind.deser.ValueInstantiator,com.fasterxml.jackson.core.JsonParser,java.lang.String,java.lang.Object[]", "<sample:6>", "<sample:3>", "<sample:5>", "Title", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: \"%s\" {getLocalizedMessage=\"%s\", getMessage=\"%s\", getOriginalMessage=\"%s\", getPathReference=, getStackTrace=[com.fasterxml.jackson.databind.JsonMapp...#241#199994864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.ClassUtil", "com.fasterxml.jackson.databind.util.ClassUtil", "closeOnFailAndThrowAsIOE", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "java.io.Closeable", "java.lang.Exception"}, new String[]{"<null>", "<sample:3>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getNodeFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "unknownTypeException", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String", "<sample:22>", "null", "{\"a\":1}"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportBadDefinition", "java.lang.Class,java.lang.String", "<empty>", "(was "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_verifyStringForScalarCoercion", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "-0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "getAnnotation", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.SettableBeanProperty", "_throwAsIOE", "com.fasterxml.jackson.core.JsonParser,java.lang.Exception,java.lang.Object", "<sample:1>", "<sample:0>", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:3>", "<sample:3>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<null>", "<sample:8>", "<sample:1>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getSerializationView", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findKeySerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "reportBadDefinition", "java.lang.Class,java.lang.String", "<sample:9>", "ttI"}, {"com.fasterxml.jackson.databind.SerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.PropertyBuilder", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_throwWrapped", new String[]{"java.lang.Exception", "java.lang.String", "java.lang.Object"}, new String[]{"<sample:2>", "m", "<i:-2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1e10", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "]...[", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:5>", "<null>", "Hello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getKnownPropertyNames", ""}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDate", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-1.5", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "setObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[creator property, name 'sample'; inject id '1.5'] {getCreatorIndex=6, getManagedReferenceName=null, getName=sample, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasV...#265#-27994222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseDoublePrimitive", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:10>", "Unsuitable method ("}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_coerceTextualNull", "com.fasterxml.jackson.databind.DeserializationContext,boolean", "<sample:2>", "false"}, {"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_verifyNullForPrimitiveCoercion", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:10>", ".N>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_createAndCacheUntypedSerializer", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "findValueSerializer", "java.lang.Class", "<sample:12>"}, {"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "setDefaultKeySerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<s:iex>", "20"}, true), new String[][]{{"printStackTrace", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.Throwable) (through reference chain: java.lang.String[20]) {getLocalizedMessage=(was java.lang.Throwable) (through reference chain: ...#467#-390407373", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:2>", "<s:O)33>", "2147483539"}, true), new String[][]{{"getPathReference", "", "1"}, {"getProcessor", "", "2"}, {"prependPath", "com.fasterxml.jackson.databind.JsonMappingException$Reference", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: java.lang.Throwable:  (through reference chain: java.lang.Integer[2147483647]->java.lang.String[2147483539]) {getLocalizedMessage=java.lang.Throwab...#537#-1035867379", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JsonMappingException", "com.fasterxml.jackson.databind.JsonMappingException", "wrapWithPath", new String[]{"java.lang.Throwable", "com.fasterxml.jackson.databind.JsonMappingException$Reference"}, new String[]{"<empty>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException: (was java.lang.Throwable) (through reference chain: java.lang.String[?]) {getLocalizedMessage=(was java.lang.Throwable) (through reference chain: j...#465#943158373", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DatabindContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "getAnnotationIntrospector", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "getArrayBuilders", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "weirdNumberException", "java.lang.Number,java.lang.Class,java.lang.String", "<i:-1>", "<sample:3>", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.databind.DeserializationContext", "isEnabled", "com.fasterxml.jackson.databind.MapperFeature", "<sample:2>"}}, 1), new String[][]{{"findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "5"}, {"allIntrospectors", "", "1"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<null>", "java.", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadTypeDefinition", new String[]{"com.fasterxml.jackson.databind.BeanDescription", "java.lang.String", "java.lang.Object[]"}, new String[]{"<sample:5>", "jCava.", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "_desc", "java.lang.String", "12:30:55"}, {"com.fasterxml.jackson.databind.SerializerProvider", "getUnknownTypeSerializer", "java.lang.Class", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "isUnknownTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructSettableProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:8>", "<sample:5>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "filterBeanProps", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,java.util.List,java.util.Set", "<null>", "<sample:4>", "<sample:1>", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:12>", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map", "<sample:7>", "<sample:4>", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "setNullKeySerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "findValueSerializer", "java.lang.Class,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:8>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "handleUnknownProperty", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:2>", "<sample:6>", "<s:.>", "1L"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "handleInstantiationProblem", new String[]{"java.lang.Class", "java.lang.Object", "java.lang.Throwable"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "reportInputMismatch", "com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.Object[]", "<sample:19>", "->", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_parseFloatPrimitive", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "getKnownPropertyNames", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructSettableProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>", "<sample:5>", "<sample:16>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:4>", "<sample:12>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "isIgnorableType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,java.lang.Class,java.util.Map", "<sample:7>", "<sample:7>", "<sample:11>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:5>", "<sample:2>", "<sample:0>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:25>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitAnyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:9>", "<sample:5>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:null; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=EXTERNAL_PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "9 E>>PT1H"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "hasSomeOfFeatures", "int", "-9"}}, 3), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: 9 E>>PT1H\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] (through reference chain: java.lang.I...#585#1902005977", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "9  E>>PS1H*215s7483647"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "constructCalendar", "java.util.Date", "<sample:2>"}}, 3), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: 9  E>>PS1H*215s7483647\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] (through reference chain...#605#216240155", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:0>", "<sample:4>", "9  E>>PS1H*215s7483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "handleUnexpectedToken", "java.lang.Class,com.fasterxml.jackson.core.JsonParser", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.DatabindContext", "getTypeFactory", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "constructCalendar", "java.util.Date", "<sample:4>"}}, 1), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_ARRAY: 9  E>>PS1H*215s7483647\n at [Source: UNKNOWN; line: 1, column: 0] (through reference chain: jav...#600#347511372", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:9>", "<sample:2>", "B"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.DeserializationContext", "parseDate", "java.lang.String", "problem: (%s) %s"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "12:0:45", "<sample:0>"}}, 1), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: B\n at [Source: UNKNOWN; line: 1, column: -1] (through reference chain: java.lang.String[\"a\"])...#564#-1056042071", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:4>", "<sample:6>", "m"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "getActiveView", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportUnknownProperty", "java.lang.Object,java.lang.String,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "12:0:45", "<sample:0>"}}, 1), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected VALUE_EMBEDDED_OBJECT: m\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] (through reference chain: java.lan...#589#-283096043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=true, getDeserializationFeatures=237020304}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:4>", "<sample:2>", "9"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.DatabindContext", "getActiveView", ""}, {"com.fasterxml.jackson.databind.DeserializationContext", "mappingException", "java.lang.Class,com.fasterxml.jackson.core.JsonToken", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.DeserializationContext", "reportBadDefinition", "com.fasterxml.jackson.databind.JavaType,java.lang.String", "<sample:6>", "m"}}, 3), new String[][]{{"prependPath", "java.lang.Object,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected END_OBJECT: 9\n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] (through reference chain: java.lang.String[\"a...#567#1455489875", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "_isNaN", new String[]{"java.lang.String"}, new String[]{"Unsuitabl:e method (0.75 "}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "handleMissingEndArrayForSingle", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>", "<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>", "<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_dateFormat", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.SerializerProvider", "getDefaultPropertyFormat", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "hasSerializationFeatures", "int", "3"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:5>", "1"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:6>", "2.0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:6>", "2.0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:6>", "2.0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#346#-691812784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDefault", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromDouble", "com.fasterxml.jackson.databind.DeserializationContext,double", "<sample:6>", "2.0"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "unwrapAndWrapException", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createUsingArrayDelegate", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#303#-1992659196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:2>", "<sample:0>", "<null>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:2>", "<sample:0>", "<null>", "<sample:2>"}}, 3), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:2>", "<sample:0>", "<null>", "<sample:2>"}}, 3), new String[][]{{"findBackReference", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromIntCreator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=true, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, can...#297#-865407687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:1>", "<sample:0>", "<null>", "<sample:2>"}}, 3), new String[][]{{"getObjectIdReader", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:1>", "<sample:0>", "<null>", "<sample:2>"}}, 3), new String[][]{{"getObjectIdReader", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<sample:5>", "<sample:1>", "<sample:0>", "<null>", "<sample:2>"}}, 2), new String[][]{{"getNullValue", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id 'null']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=6, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=true, hasViews=false...#255#225895202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[creator property, name '0'; inject id '1']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '0'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=0, getPropertyIndex=-1, hasValueDeserializer=true, hasValueTypeDeserializer=true, hasViews=false, ...#252#1014516009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[creator property, name ''; inject id 'null']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name ''; inject id 'null'] {getCreatorIndex=8, getManagedReferenceName=null, getName=, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeserializer=false, hasViews=fals...#256#833431607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.SettableBeanProperty", "com.fasterxml.jackson.databind.deser.CreatorProperty", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[creator property, name '<a><b>t</b></a>'; inject id '1']", String.valueOf(actual));
  assertEquals("receiver state after the call", "[creator property, name '<a><b>t</b></a>'; inject id '1'] {getCreatorIndex=9, getManagedReferenceName=null, getName=<a><b>t</b></a>, getPropertyIndex=-1, hasValueDeserializer=false, hasValueTypeDeseri...#282#-1821729577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:0>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "addObjectIdReader", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder", "<sample:3>", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:7>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:7>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:5>", "<sample:8>", "<sample:4>", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:5>", "<sample:8>", "<sample:4>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:5>", "<sample:8>", "<sample:4>", "<sample:2>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:5>", "<sample:8>", "<sample:0>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>", "<sample:1>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:3>", "<sample:0>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:3>", "<sample:0>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdDeserializer", "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer", "getNullValue", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_parseDateFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:4>"}}, 1), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:4>", "<sample:0>", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:4>", "<sample:2>", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:4>", "<sample:2>", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}, {"getNullValue", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1.5", "<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "_format", new String[]{"java.lang.String", "java.lang.Object[]"}, new String[]{"1.5", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getBeanClass", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "hasKnownClassAnnotations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{hasKnownClassAnnotations=!NullPointerException, isNonStaticInnerClass=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "getBeanClass", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "hasKnownClassAnnotations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromArraySettings", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.deser.SettableBeanProperty[]"}, new String[]{"<sample:5>", "<sample:7>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getWithArgsCreator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=true, can...#322#180656140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`generated.algorithm.SearchInputFactory_scaffolding$TypeSamples`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#2066247587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDefaultCreator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNKNOWN TYPE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`generated.algorithm.SearchInputFactory_scaffolding$TypeSamples`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#2066247587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getDelegateType", "com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNKNOWN TYPE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`generated.algorithm.SearchInputFactory_scaffolding$TypeSamples`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#2066247587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#334#881158522", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#303#-1992659196", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#297#1475595349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:4>", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNKNOWN TYPE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#307#855313459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`java.lang.Integer`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#314#-1646701375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, $0 -> $0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#344#-721806452", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "configureFromStringCreator", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=true, canCreateUsingArrayDelegate=false, can...#322#478090782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:1>", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#324#-2126697502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getValueTypeDesc", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "rewrapCtorProblem", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.Throwable", "<sample:7>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromLong", "com.fasterxml.jackson.databind.DeserializationContext,long", "<sample:1>", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`java.lang.Comparable`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#319#-1171696243", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "instantiationException", new String[]{"java.lang.Class", "java.lang.Throwable"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "reportBadDefinition", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.String", "java.lang.Throwable"}, new String[]{"<sample:0>", "{\"a\":1}", "<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "_handleResolvable", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.SerializerProvider", "isEnabled", "com.fasterxml.jackson.databind.SerializationFeature", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl", "getFilterProvider", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.DefaultSerializerProvider", "objectIdResolverInstance", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:4>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "java.util.Navigabledet"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#1344507954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java.util.Navigabledet"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#359#1344507954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java.util.Navigabledet"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#299#-1213177327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java.util.Navigabledet"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#309#-1951095057", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "canCreateUsingDelegate", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "getIncompleteParameter", ""}, {"com.fasterxml.jackson.databind.deser.std.StdValueInstantiator", "createFromString", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java.util.Navigabledet"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canCreateFromBoolean=false, canCreateFromDouble=false, canCreateFromInt=false, canCreateFromLong=false, canCreateFromObjectWith=false, canCreateFromString=false, canCreateUsingArrayDelegate=false, ca...#316#1901817477", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<sample:4>", "<sample:3>", ": "}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (null), expected START_ARRAY: : \n at [Source: (byte[])\"\ufffd\"; line: 1, column: 0] {getLocalizedMessage=Unexpected token (null...#501#1445321939", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOverrideAccessModifiers=!NullPointerException, getDeserializationFeatures=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl", "wrongTokenException", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.core.JsonToken", "java.lang.String"}, new String[]{"<null>", "<sample:3>", ": "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
