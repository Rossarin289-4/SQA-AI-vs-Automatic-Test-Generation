package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "missing property '", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"baseTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}}), new String[][]{{"baseTypeName", "", "7"}, {"getDefaultImpl", "", "1"}, {"deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 40, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:11>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:0>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class java.util.List, contains [recursive type; UNRESOLVED]; id-resolver: GeneratedTestInputP...#257#-112663314", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:0>"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "0x123456789", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "0"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "0x1F", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "0x1F", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "0x1F", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "0x1F", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>", "<sample:0>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}}, 3), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}}, 2), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:6>", "<s:key>"}}, 3), new String[][]{{"getTypeInclusion", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}, 3), new String[][]{{"getTypeInclusion", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "1e10", "<sample:0>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:3>"}}, 2), new String[][]{{"baseTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:3>"}}, 2), new String[][]{{"baseTypeName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:5>", "<sample:1>", "<i:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "Hello, World"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"baseTypeName", "", "4"}, {"getPropertyName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "Hello, Wosld"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"baseTypeName", "", "4"}, {"getDefaultImpl", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "Hello, Wosld"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}}, 2), new String[][]{{"baseTypeName", "", "4"}, {"getDefaultImpl", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}}, 3), new String[][]{{"baseTypeName", "", "7"}, {"getDefaultImpl", "", "1"}, {"deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}}, 3), new String[][]{{"baseTypeName", "", "7"}, {"getPropertyName", "", "1"}, {"getDefaultImpl", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}}, 3), new String[][]{{"baseTypeName", "", "7"}, {"getPropertyName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "01A\t", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 3), new String[][]{{"baseTypeName", "", "0"}, {"getPropertyName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<null>"}}, 3), new String[][]{{"baseTypeName", "", "0"}, {"getPropertyName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 3), new String[][]{{"baseTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}}, 3), new String[][]{{"getDefaultImpl", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"getTypeIdResolver", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"getPropertyName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:5>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WR...#212#847182834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type...#304#-1739415048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type...#304#-1739415048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#302#-239962842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:8>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:3>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:3>", "<sample:5>"}}, 3), new String[][]{{"idFromBaseType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>"}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:0>", "<s:>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}}, 2), new String[][]{{"deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}}, 1), new String[][]{{"getTypeIdResolver", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "a", "<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>", "<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>", "<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:0>", "12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<null>"}}), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:5>", "<sample:7>", "<sample:7>"}}), new String[][]{{"getTypeInclusion", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:4>"}}), new String[][]{{"getTypeInclusion", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "missing property '", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}), new String[][]{{"baseTypeName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:1>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "I"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "Hell, Wnsld"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:0>"}}), new String[][]{{"baseTypeName", "", "7"}, {"getDefaultImpl", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:3>", "Hell, Wnsld"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:3>"}}), new String[][]{{"baseTypeName", "", "7"}, {"getDefaultImpl", "", "1"}, {"deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}), new String[][]{{"baseTypeName", "", "0"}, {"getPropertyName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "010\t", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}}), new String[][]{{"baseTypeName", "", "0"}, {"getPropertyName", "", "1"}, {"getDefaultImpl", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:5>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}), new String[][]{{"baseTypeName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:1>"}}), new String[][]{{"getPropertyName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:1>"}}), new String[][]{{"getPropertyName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:1>"}}), new String[][]{{"getPropertyName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#247#-1305014999", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#267#-2071969876", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#299#-217285888", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:2>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false), new String[][]{{"idFromValueAndType", "java.lang.Object,java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "[1,2]", "<sample:4>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "[[1C,2{] ", "<sample:7>", "<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidTypeIdException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:5>", "<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("EXTERNAL_PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:6>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:0>", "<sample:2>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<sample:2>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<sample:2>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WR...#212#847182834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:0>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:4>", "<b:true>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("EXTERNAL_PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("EXISTING_PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WR...#212#847182834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WR...#212#847182834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:7>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("EXISTING_PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#247#-1305014999", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#267#-2071969876", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#299#-217285888", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#299#-217285888", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<null>", "<sample:2>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "[1,2]"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"idFromValueAndType", "java.lang.Object,java.lang.Class", "3"}, {"idFromBaseType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"idFromValueAndType", "java.lang.Object,java.lang.Class", "3"}, {"idFromBaseType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"getRawClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<sample:3>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<sample:1>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:5>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "3"}, {"idFromValue", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>", "<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:4>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:6>", "<sample:1>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:3>", "<sample:1>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#323#481531510", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:4>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[array type, component type: [recursive type; UNRESOLVED]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0,...#236#-1643374688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:4>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:4>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[array type, component type: [recursive type; UNRESOLVED]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0,...#227#-813059140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>", "<sample:5>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"getTypeIdResolver", "", "4"}, {"getDescForKnownTypeIds", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>", "<sample:9>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:6>", "<null>", "<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<null>", "<null>", "<sample:1>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>", "<empty>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}, {"getContentType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "abcc"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "abcc"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "abcc"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("EXTERNAL_PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "abcc"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "abcc"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:4>", "abcc"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("EXISTING_PROPERTY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:5>", "12:30:45"}}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#595#1857139552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "a,b,c", "<sample:8>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:2>", "<s:jey>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "1ee10"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:9>", "1ee10"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:3>", "z"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type...#304#-1739415048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#302#-239962842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>", "<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:3>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "null", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#293#-540914250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:7>", "<sample:0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 1), new String[][]{{"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("CLASS", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 1), new String[][]{{"getMechanism", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$Id", actual.getClass().getName());
  assertEquals("NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 1), new String[][]{{"idFromValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 1), new String[][]{{"idFromValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type...#304#-1739415048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 1), new String[][]{{"idFromValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNR...#302#-239962842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedForId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>", "<sample:6>", "<sample:8>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#596#-2107479485", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=a, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, [recursive type; UNRESOLVED ->...#370#2012701812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[recursive type; UNRESOLVED>] {getErasedSignature=Lg...#641#127275825", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WR...#212#847182834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "1"}, {"forcedNarrowBy", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [recursive type; UNRESOLVED] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: [recursive type...#476#918304886", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInput...#253#1583290995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<null>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "-1", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "toString", ""}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#357#1950987585", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [recursive type; UNRESOLVED] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: [recursive type...#476#918304886", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]; id-resolver: GeneratedTestInput...#253#-73721018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"toCanonical", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf]; id-resolver: GeneratedTestInput...#253#-73721018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class java.lang.Integer<generated.algorithm.SearchInputFactory_scaffolding$GenericBase<[recursive t...#308#226146048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_deserializeTypedUsingDefaultImpl", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:6>", "<sample:6>", "<sample:3>"}}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"forcedNarrowBy", "java.lang.Class", "5"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PR...#207#1040028358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"forcedNarrowBy", "java.lang.Class", "5"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=PROPERTY}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "0"}, {"getBindings", "", "5"}, {"getTypeParameters", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericBase, contains [recursive typ...#314#1669141077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> ...#323#-1638948002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"idFromValueAndType", "java.lang.Object,java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInput...#351#-1431823241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"idFromValueAndType", "java.lang.Object,java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRA...#212#397256426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_usesExternalId", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", "_locateTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: GeneratedTestInputProxy] {getPropertyName=sample, getTypeInclusion=PROPERT...#202#-1046904206", SearchInputFactory_scaffolding.receiverState());
 }
}
