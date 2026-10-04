package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "abc", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:0>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "1.12345678901234567"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "1.12345678901234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<b:true>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:4>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "1e10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "http://example.com/a?c=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "-1.85", "<sample:0>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false), new String[][]{{"getDescForKnownTypeIds", "", "3"}, {"getDescForKnownTypeIds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getDescForKnownTypeIds", "", "3"}, {"getDescForKnownTypeIds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>", "<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<i:-1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:5>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [r...#323#-1648112061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:4>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [r...#323#-1648112061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:1>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#250#1859067054", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "1.12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "a", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:5>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:1>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:2>", ".5", "<sample:3>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<null>", "1.123456889y1234x67", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<null>", "1.123456889y1234x67", "<sample:8>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:5>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "PT1H2020-02-30T25:61:61"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:9>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "1.5d"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "1.25", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "-1.5"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "PT1H2020-02-30T25:61:61", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:2>", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:5>", "<i:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2), new String[][]{{"deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "0", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "0", "<null>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "i"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "i"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "i"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.12345678901234567"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:7>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.12345678901234567"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NONE", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:7>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.12345678901234567"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NONE", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:7>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "1.12345678901234567"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("MINIMAL_CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:7>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "1.12345678901234567"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("MINIMAL_CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "1.12345678901234567"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CUSTOM", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:1>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "6"}, {"init", "com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:1>", "<sample:0>"}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "6"}, {"init", "com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:1>", "<sample:0>"}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "2"}, {"withContentType", "com.fasterxml.jackson.databind.JavaType", "0"}, {"getParameterSource", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false), new String[][]{{"getTypeInclusion", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:7>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false), new String[][]{{"deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false), new String[][]{{"getTypeInclusion", "", "6"}, {"getDefaultImpl", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:7>", "<i:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [r...#323#-1648112061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.1234567"}}, 3), new String[][]{{"baseTypeName", "", "5"}, {"deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "1.1234567"}}, 3), new String[][]{{"baseTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "1.1234567"}}, 3), new String[][]{{"getDefaultImpl", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "2147483648"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}), new String[][]{{"getTypeInclusion", "", "6"}, {"getTypeIdResolver", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "2147483648"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}, 1), new String[][]{{"getTypeInclusion", "", "6"}, {"getTypeIdResolver", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "2147483648"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}), new String[][]{{"getTypeInclusion", "", "6"}, {"getTypeIdResolver", "", "1"}, {"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "2147483648"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}), new String[][]{{"getTypeInclusion", "", "6"}, {"getTypeIdResolver", "", "1"}, {"getMechanism", "", "1"}, {"idFromBaseType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}), new String[][]{{"getTypeInclusion", "", "6"}, {"getTypeIdResolver", "", "1"}, {"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}, 3), new String[][]{{"getTypeInclusion", "", "6"}, {"getTypeIdResolver", "", "1"}, {"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>", "<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "1.12345678", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 1), new String[][]{{"deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "0", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"getDescForKnownTypeIds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"getDescForKnownTypeIds", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}}), new String[][]{{"idFromBaseType", "", "0"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/Se...#626#1033807214", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "known type ids = "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "known type ids = "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [r...#323#-1648112061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<i:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}), new String[][]{{"baseTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>", "<sample:1>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "; id-resolver: "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}, 2), new String[][]{{"idFromValue", "java.lang.Object", "4"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"findSuperType", "java.lang.Class", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}, 2), new String[][]{{"idFromValue", "java.lang.Object", "4"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"findSuperType", "java.lang.Class", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>"}}, 2), new String[][]{{"idFromValue", "java.lang.Object", "4"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"findSuperType", "java.lang.Class", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: [resolved recursive type -> null]]; id-resolver: GeneratedTestInputProxy] {getPropertyName...#235#559687913", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"idFromValue", "java.lang.Object", "4"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"findSuperType", "java.lang.Class", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}), new String[][]{{"idFromValue", "java.lang.Object", "4"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"findSuperType", "java.lang.Class", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [r...#323#-1648112061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "known tycpe ids = "}}, 3), new String[][]{{"getTypeIdResolver", "", "5"}, {"getDescForKnownTypeIds", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 3), new String[][]{{"getTypeIdResolver", "", "5"}, {"getDescForKnownTypeIds", "", "7"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_sca...#605#596082807", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 3), new String[][]{{"getTypeIdResolver", "", "5"}, {"getDescForKnownTypeIds", "", "7"}, {"idFromBaseType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:6>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:2>"}}), new String[][]{{"getTypeIdResolver", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 1), new String[][]{{"idFromBaseType", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#250#1859067054", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_A...#205#16803765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:7>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive typ...#301#-114992291", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "3"}, {"getMechanism", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"getDefaultImpl", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[resolved recursive type -> null]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_AR...#204#1955536373", SearchInputFactory_scaffolding.receiverState());
 }
}
