package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "1e10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>", "<sample:5>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "a b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "a b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "a- b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "a- b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "a- b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "a- b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "2147483648"}}), new String[][]{{"deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "2147483648"}}), new String[][]{{"getTypeIdResolver", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}), new String[][]{{"getTypeIdResolver", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2), new String[][]{{"getTypeIdResolver", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2), new String[][]{{"getTypeIdResolver", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}, 2), new String[][]{{"deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"getTypeIdResolver", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "; id-resolver: "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"getTypeIdResolver", "", "5"}, {"idFromBaseType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"getTypeIdResolver", "", "5"}, {"idFromBaseType", "", "2"}, {"init", "com.fasterxml.jackson.databind.JavaType", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"getTypeIdResolver", "", "5"}, {"idFromBaseType", "", "2"}, {"init", "com.fasterxml.jackson.databind.JavaType", "3"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub><[recursive type; UNRESOLVED>] {getErasedSignature=L...#642#-841667623", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1.5"}}, 2), new String[][]{{"getDefaultImpl", "", "5"}, {"baseTypeName", "", "2"}, {"getDefaultImpl", "", "3"}, {"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1."}}), new String[][]{{"getDefaultImpl", "", "5"}, {"baseTypeName", "", "2"}, {"getDefaultImpl", "", "3"}, {"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1."}}, 3), new String[][]{{"getDefaultImpl", "", "5"}, {"baseTypeName", "", "2"}, {"getDefaultImpl", "", "3"}, {"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1."}}, 3), new String[][]{{"getDefaultImpl", "", "5"}, {"baseTypeName", "", "2"}, {"getDefaultImpl", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "\u00e9"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:7>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "1.5d"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", ".5"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:2>", "."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "1.25"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "1.25"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:2>", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:4>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "2020-01-01"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<s:key>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "1.1234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:2>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:0>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:0>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "1.1234567890123456"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:6>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:3>", "<s:key>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "2020-01-01I"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<null>", "1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:8>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "/a/b"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", ".5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}}, 2), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}}, 2), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", ".5"}}, 2), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:6>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:6>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARR...#203#1224705199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:5>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "; id-resolver: "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:10>", "; id-resolver: "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:8>", ".ul"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:9>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"hasValueHandler", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"hasHandlers", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}), new String[][]{{"isJavaLangObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}}), new String[][]{{"isFinal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "a b"}}, 1), new String[][]{{"isFinal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "a b"}}, 1), new String[][]{{"isJavaLangObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}, 1), new String[][]{{"isJavaLangObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}), new String[][]{{"isJavaLangObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}}), new String[][]{{"isJavaLangObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<null>"}}), new String[][]{{"getTypeInclusion", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:8>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "null"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false), new String[][]{{"getMechanism", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NONE", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("MINIMAL_CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("MINIMAL_CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("MINIMAL_CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"getMechanism", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NONE", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "; id-resolver: "}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "-0.0"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "abc"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "0.71"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "=`"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARR...#203#1224705199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 18, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTy...#226#331486324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "+1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}, 1), new String[][]{{"deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:10>"}}, 1), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}, 1), new String[][]{{"getTypeInclusion", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]; id-resolver: GeneratedTestInputPro...#254#-152645613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "  "}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false), new String[][]{{"idFromBaseType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"idFromBaseType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"idFromBaseType", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:0>", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:0>", "<i:2>"}}, 3), new String[][]{{"idFromValueAndType", "java.lang.Object,java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "cc"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "bc"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "I"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "x123456789"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "\n"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false), new String[][]{{"getParameterSource", "", "6"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<null>", "<sample:6>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<null>", "<sample:7>", "<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARR...#203#1224705199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:7>", "<d:2.200000000000001>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:5>", "<empty>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}), new String[][]{{"baseType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 1), new String[][]{{"getPropertyName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 1), new String[][]{{"getPropertyName", "", "2"}, {"getDefaultImpl", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "1147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: $0] {getErasedSignature=[$0, getGenericSignature=[$0, getTypeName=[array type, component type: $0], hasContentType=true, hasGenericTypes=false, hasHandlers=true, hasValueH...#390#725501520", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}}), new String[][]{{"isEnumType", "", "0"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"containedType", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<null>", "<sample:5>", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "--1"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 1), new String[][]{{"idFromBaseType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "--1"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}}, 1), new String[][]{{"idFromBaseType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}}), new String[][]{{"getTypeIdResolver", "", "3"}, {"idFromValueAndType", "java.lang.Object,java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "\n"}}, 3), new String[][]{{"getTypeIdResolver", "", "3"}, {"idFromValueAndType", "java.lang.Object,java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#202#1727789454", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"idFromValue", "java.lang.Object", "3"}, {"idFromValue", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$1 {getErasedSignature=$1, getGenericSignature=$1, getTypeName=$1, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#852059868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$1 {getErasedSignature=$1, getGenericSignature=$1, getTypeName=$1, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#852059868", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$2 {getErasedSignature=$2, getGenericSignature=$2, getTypeName=$2, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-1713694534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2), new String[][]{{"isConcrete", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"hasRawClass", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:4>"}}, 3), new String[][]{{"hasValueHandler", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:4>"}}, 3), new String[][]{{"isAbstract", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:4>"}}, 3), new String[][]{{"hasRawClass", "java.lang.Class", "0"}, {"hasGenericTypes", "", "6"}, {"getErasedSignature", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("$1", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 3), new String[][]{{"isAbstract", "", "0"}, {"hasRawClass", "java.lang.Class", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 3), new String[][]{{"hasValueHandler", "", "0"}, {"hasHandlers", "", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false), new String[][]{{"baseType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"baseType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"baseType", "", "7"}, {"getContentType", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false), new String[][]{{"baseType", "", "7"}, {"getContentType", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 1), new String[][]{{"baseType", "", "7"}, {"getContentValueHandler", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<s:a>"}}, 1), new String[][]{{"baseType", "", "7"}, {"getContentValueHandler", "", "4"}, {"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.Object, contains $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTyp...#225#580214102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<s:a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1), new String[][]{{"baseType", "", "7"}, {"getContentType", "", "4"}, {"isEnumType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<s:[a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 2), new String[][]{{"baseType", "", "7"}, {"getContentType", "", "4"}, {"isEnumType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<null>", "<s:[a>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 2), new String[][]{{"baseType", "", "7"}, {"getContentType", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1L"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Hello, Worlc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1L"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Hello, Worlc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1L"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Hello, Worlc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1L"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "aaaaaaaaaaa`aaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Hello, Worlc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "1L"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "aaaaaaaaaaa`aaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:1>", "Hello, Worlc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<null>", "<sample:5>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:6>", "1.25"}}, 2), new String[][]{{"baseTypeName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARR...#203#1224705199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "2"}, {"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseType", ""}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "2"}, {"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CUSTOM", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleMissingTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "[1,2]"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$1; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleMissingTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "1.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$2; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: $0]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARR...#203#1224705199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:7>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_ARRAY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#202#1727789454", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
}
