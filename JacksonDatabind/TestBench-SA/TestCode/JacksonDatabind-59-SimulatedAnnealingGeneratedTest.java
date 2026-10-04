package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.ParameterizedType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#595#-1823180577", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#693#-593736246", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isMapLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "withValueHandler", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.databind.type.MapLikeType", "containedTypeName", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:12>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:5>"}}), new String[][]{{"withStaticTyping", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.Collection, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED]] {getErasedSign...#611#144731399", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isMapLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withCache", new String[]{"com.fasterxml.jackson.databind.util.LRUMap"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:6>"}}, 3), new String[][]{{"getContentTypeHandler", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:4>"}}), new String[][]{{"getContentTypeHandler", "", "3"}, {"toCanonical", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.ArrayList<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "0"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:2>", "<sample:2>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:0>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withStaticTyping", "", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:17>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", ".5"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getContentValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "containedTypeName", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "withContentTypeHandler", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.type.CollectionLikeType", "containedTypeName", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "flat"}}, 2), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "0"}, {"getValueHandler", "", "4"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "0"}, {"getTypeName", "", "1"}, {"getBindings", "", "6"}, {"findBoundType", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "1"}, {"getTypeName", "", "1"}, {"getBindings", "", "6"}, {"findBoundType", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:7>", "<sample:2>", "<sample:8>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:7>", "<sample:12>", "<sample:16>"}}, 2), new String[][]{{"isPrimitive", "", "4"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:1>", "<sample:7>", "<sample:14>"}}, 2), new String[][]{{"getReferencedType", "", "6"}, {"withTypeHandler", "java.lang.Object", "3"}, {"forcedNarrowBy", "java.lang.Class", "7"}, {"withContentTypeHandler", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class int, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED] {getErasedSignature=I, getGenericSignature=!NullPointerException, getTypeName=[map-like type; class int, [recursi...#491#1826966579", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "rawClass", new String[]{"java.lang.reflect.Type"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasContentType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "getParameterSource", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"void"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class void] {getErasedSignature=V, getGenericSignature=V;, getTypeName=[simple type, class void], hasContentType=false, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, i...#377#-1422991791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.CollectionLikeType", "isPrimitive", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", "com.fasterxml.jackson.databind.type.TypeModifier", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:3>", "<null>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.537>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "withKeyType", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.MapLikeType", "hasValueHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:0>", "<sample:11>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<null>"}}, 2), new String[][]{{"constructCollectionLikeType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Integer, contains [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$Generic...#658#-1621907950", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "isJavaLangObject", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:0>", "<sample:6>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:4>", "<empty>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:4>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:7>", "<sample:3>"}}, 2), new String[][]{{"getContentTypeHandler", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_findWellKnownSimple", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:4>", "<sample:10>", "<sample:9>"}}), new String[][]{{"isTrueCollectionType", "", "5"}, {"toCanonical", "", "7"}, {"getContentType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#564#1962397251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:8>", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:7>", "<sample:4>", "<sample:10>", "<sample:12>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:4>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "2"}, {"toCanonical", "", "7"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}, {"withKeyValueHandler", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.util.Map, [simple type, class java.lang.Object] -> [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/Map;, getGenericSignature=Ljava/util/Map<Ljava/lang/Objec...#563#1941050400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>", "<sample:8>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromAny", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:0>"}}), new String[][]{{"isTrueMapType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isAbstract", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "withKeyTypeHandler", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "getGenericSignature", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:0>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "boolean"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:9>", "<sample:2>", "<sample:1>", "<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:14>", "<sample:11>", "<sample:7>"}}), new String[][]{{"hasRawClass", "java.lang.Class", "2"}, {"getTypeName", "", "2"}, {"hasContentType", "", "2"}, {"isContainerType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:12>", "<sample:6>", "<sample:3>", "<sample:11>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "char"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:14>", "<sample:15>", "<sample:3>"}}), new String[][]{{"isReferenceType", "", "7"}, {"hasHandlers", "", "2"}, {"hasContentType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_findPrimitive", "java.lang.String", "double"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:2>", "<empty>"}, false), new String[][]{{"getContentTypeHandler", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "containedType", new String[]{"int"}, new String[]{"-8"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "hasValueHandler", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "containedType", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "isTrueMapType", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "withKeyType", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:3>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.util.Map, [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED] -> [collection typ...#728#1188870233", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:0>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:12>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "<a>b</a>"}}), new String[][]{{"withStaticTyping", "", "0"}, {"getParameterSource", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:11>", "<sample:8>", "<sample:16>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:16>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:12>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "7"}, {"withKeyValueHandler", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class int, [array type, component type: [simple type, class java.lang.String]] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignatur...#627#-994839454", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:15>", "<sample:23>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSpecializedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<sample:5>"}}), new String[][]{{"containedType", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.util.Collection, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED]] {getErasedSign...#611#-547537650", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_resolveSuperInterfaces", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:1>", "<sample:3>", "<sample:5>"}}), new String[][]{{"findSuperType", "java.lang.Class", "5"}, {"hasContentType", "", "0"}, {"containedTypeCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:3>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", "java.lang.ClassLoader", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:16>", "<sample:4>", "<sample:0>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:13>", "<sample:0>", "<null>"}}, 2), new String[][]{{"isThrowable", "", "6"}, {"isTypeOrSubTypeOf", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructType", new String[]{"java.lang.reflect.Type", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:9>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.GenericArrayType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:4>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "byte"}}), new String[][]{{"getGenericSignature", "", "3"}, {"containedTypeName", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#595#-1823180577", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:3>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:3>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:3>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:3>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:3>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:3>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:10>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:3>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:8>", "<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:5>", "<sample:1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "isArrayType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.ArrayList, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED]] {getErasedSigna...#610#-1296545260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"getContentTypeHandler", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:6>"}}, 3), new String[][]{{"getContentTypeHandler", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:15>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:8>"}}, 3), new String[][]{{"getContentTypeHandler", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:8>"}}, 3), new String[][]{{"getContentTypeHandler", "", "3"}, {"isAbstract", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:10>"}}, 2), new String[][]{{"getContentTypeHandler", "", "3"}, {"isAbstract", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getParameterSource", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:12>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:12>"}}, 2), new String[][]{{"findSuperType", "java.lang.Class", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withClassLoader", new String[]{"java.lang.ClassLoader"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:12>"}}, 1), new String[][]{{"findSuperType", "java.lang.Class", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}, 3), new String[][]{{"findSuperType", "java.lang.Class", "3"}, {"toCanonical", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.ArrayList<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:17>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}, 3), new String[][]{{"findSuperType", "java.lang.Class", "3"}, {"useStaticType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}, 1), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"toCanonical", "", "4"}, {"isEnumType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}, 2), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"toCanonical", "", "4"}, {"isEnumType", "", "4"}, {"containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasContentType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:11>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}, 2), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"isEnumType", "", "4"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:4>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, [simple type, class java.lang.Object] -> [reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFac...#682#1337515657", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isEnumType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isEnumType", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>", "<sample:0>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"withValueHandler", "java.lang.Object", "4"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"withValueHandler", "java.lang.Object", "4"}, {"isCollectionLikeType", "", "0"}, {"containedTypeOrUnknown", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>", "<sample:5>", "<sample:2>", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedType", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", new String[]{"java.lang.String"}, new String[]{"Strange Reference type "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "1.5e300"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$Gen...#592#1694171270", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFac...#613#-1035893771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"isThrowable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#594#1567312813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toCanonical", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isContainerType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "flat1E-5"}}, 2), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "0"}, {"getValueHandler", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "flat1E-5"}}, 2), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "0"}, {"hasContentType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "flat1E-5"}}, 2), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "0"}, {"getTypeName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}}, 2), new String[][]{{"containedTypeOrUnknown", "int", "0"}, {"getTypeName", "", "1"}, {"getBindings", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.WildcardType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<empty>", "<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:11>", "<sample:0>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:12>", "<sample:16>", "<sample:3>"}}, 3), new String[][]{{"findTypeParameters", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:16>", "<sample:3>"}}, 3), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"containedTypeCount", "", "0"}, {"getInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:16>", "<sample:4>"}}, 1), new String[][]{{"findTypeParameters", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:16>", "<sample:11>"}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"isContainerType", "", "0"}, {"getBindings", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:16>", "<sample:11>"}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"isContainerType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "getContentTypeHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#812#94566767", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:0>", "<sample:16>", "<sample:10>"}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$Ge...#593#-1730024665", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:0>", "<sample:16>", "<sample:11>"}}, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#598#-1570767852", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:9>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:0>", "<sample:16>", "<sample:11>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:11>", "<sample:6>"}}, 1), new String[][]{{"getParameterSource", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "withContentValueHandler", "java.lang.Object", "<i:-1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:17>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:2>", "<sample:16>", "<sample:11>"}}, 3), new String[][]{{"forcedNarrowBy", "java.lang.Class", "3"}, {"withContentTypeHandler", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#598#-1570767852", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "hasHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "toCanonical", ""}, {"com.fasterxml.jackson.databind.type.CollectionLikeType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:0>", "<sample:16>", "<sample:16>"}}, 2), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownClass", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:6>", "<sample:5>", "<sample:3>", "<sample:2>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:16>", "<sample:4>", "<empty>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findClass", "java.lang.String", "[1,2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWellKnownInterface", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:5>", "<sample:3>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:11>", "<sample:12>", "<sample:16>"}}, 1), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "4"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:6>", "<null>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:6>", "<null>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "equals", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "getGenericSignature", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:4>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasContentType=false, hasGeneri...#435#1283031983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "isCollectionLikeType", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"findSuperType", "java.lang.Class", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#595#-1823180577", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"getContentType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isConcrete", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#595#-1823180577", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromClass", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:7>", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"withValueHandler", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#593#-1465081193", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"containedTypeCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"getBindings", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasContentType=false, hasGe...#439#-431698451", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#594#1567312813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,java.lang.Class[]", "<sample:2>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Integer] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer;, getTypeName=[simple type, class java.lang.Integer], hasContentType=false, hasGe...#439#-431698451", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericL.., getGenericSignature=Lgenerated/a...#595#-1823180577", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:2>"}}), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:3>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:4>", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isFinal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isReferenceType", ""}, {"com.fasterxml.jackson.databind.JavaType", "withValueHandler", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED]] {getErasedSignature=[Lgen...#639#-971202453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isFinal", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED]] {getErasedSignature=[Lgen...#639#-971202453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<empty>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:8>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "hashCode", ""}, {"com.fasterxml.jackson.databind.JavaType", "getContentType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.JavaType", "getErasedSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable<java.lang.Object>] {getErasedSignature=Ljava/lang/Comparable;, getGenericSignature=Ljava/lang/Comparable<Ljava/lang/Object;>;, getTypeName=[simple type, class ...#506#-978486872", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.TypeVariable,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:6>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:6>", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=Ljava/lang/C...#596#1617771968", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "isCollectionLikeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:12>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isThrowable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:7>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=Ljava/lang/Objec...#588#-824322868", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=I, getGenericSignature=!NullP...#557#-1727054780", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:2>", "<sample:12>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}}), new String[][]{{"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=I, getGenericSignature=!NullP...#557#-1727054780", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:2>", "<sample:12>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}}), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=Ljava/lang/C...#596#1617771968", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=Ljava/lang/C...#596#1617771968", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Comparable<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>] {getErasedSignature=Ljava/lang/C...#596#1617771968", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "findTypeParameters", "java.lang.Class", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.ArrayList, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED]] {getErasedSigna...#610#-1296545260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.ArrayList, contains [collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED]] {getErasedSigna...#610#-1296545260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isJavaLangObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:0>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.ArrayList, contains [simple type, class java.lang.Object]] {getErasedSignature=Ljava/util/ArrayList;, getGenericSignature=Ljava/util/ArrayList<Ljava/lang/Object;>;, g...#538#-929507332", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:6>", "<sample:4>"}}), new String[][]{{"getContentTypeHandler", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:17>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,java.lang.Class", "<sample:1>", "<sample:10>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:4>", "<sample:4>"}}), new String[][]{{"getContentTypeHandler", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getKeyType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "containedTypeName", "int", "10"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:17>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:1>", "<sample:10>"}}), new String[][]{{"getContentTypeHandler", "", "3"}, {"isAbstract", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "toCanonical", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "hasValueHandler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", new String[]{"java.lang.Class", "java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapLikeType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:10>", "<sample:10>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructReferenceType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isJavaLangObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"toCanonical", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.ArrayList<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algorithm.SearchInputFactory_scaffolding$Gener...#207#-1673674335", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "clearCache", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<empty>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"isTrueCollectionType", "", "4"}, {"isEnumType", "", "4"}, {"containedTypeName", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:8>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:14>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"toCanonical", "", "4"}, {"isEnumType", "", "4"}, {"containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withKeyValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "containedTypeOrUnknown", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[recursive type; UNRESOLVED>] {getErasedSignature=Lge...#641#1530707382", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "3"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String"}, new String[]{"null"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"isEnumType", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "findSuperType", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "buildCanonicalName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[array type, component type: null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withModifier", new String[]{"com.fasterxml.jackson.databind.type.TypeModifier"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", ", contains "}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isFinal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "getGenericSignature", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_...#648#-1570391580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromParamType", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.ParameterizedType", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:2>", "<empty>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", "java.lang.Class,java.lang.Class", "<sample:8>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasContentType=false, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isA...#375#1769222985", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "getErasedSignature", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", "java.lang.Class,java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive typ...#714#182753128", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "uncheckedSimpleType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isTrueCollectionType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "getKeyType", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findTypeParameters", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$Gen...#592#1694171270", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "defaultInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "containedTypeOrUnknown", "int", "1"}, {"com.fasterxml.jackson.databind.type.MapLikeType", "isMapLikeType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", new String[]{"com.fasterxml.jackson.databind.JavaType", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeName", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", "java.lang.Class,java.lang.Class", "<sample:9>", "<sample:11>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getContentType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "findTypeParameters", "java.lang.Class", "<sample:12>"}, {"com.fasterxml.jackson.databind.JavaType", "useStaticType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "containedTypeCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "getSuperClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "findClass", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromWildcard", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.WildcardType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,java.lang.Class[]", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "getTypeHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedType", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getGenericSignature", "java.lang.StringBuilder", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructArrayType", "java.lang.Class", "<sample:4>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_fromVariable", new String[]{"com.fasterxml.jackson.databind.type.ClassStack", "java.lang.reflect.TypeVariable", "com.fasterxml.jackson.databind.type.TypeBindings"}, new String[]{"<sample:5>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionLikeType", "java.lang.Class,java.lang.Class", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructSimpleType", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:14>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructGeneralizedType", "com.fasterxml.jackson.databind.JavaType,java.lang.Class", "<sample:0>", "<sample:5>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "4"}, {"getContentTypeHandler", "", "5"}, {"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isArrayType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.util.List, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED]] {getErasedSignature=...#600#1848769219", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "isFinal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isContainerType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "hasValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [simple type, class java.lang.Object]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_...#648#-1570391580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "containedTypeOrUnknown", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isPrimitive", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "hasValueHandler", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:2>", "<sample:6>", "<null>", "<sample:3>"}, true), new String[][]{{"withValueHandler", "java.lang.Object", "4"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:8>", "<sample:0>", "<sample:3>"}, true), new String[][]{{"withValueHandler", "java.lang.Object", "4"}, {"isCollectionLikeType", "", "0"}, {"containedTypeOrUnknown", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toCanonical", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "toString", ""}, {"com.fasterxml.jackson.databind.type.MapLikeType", "getContentValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UN...#703#-235747210", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFac...#613#-1035893771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldin...#597#1459261775", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructMapType", "java.lang.Class,java.lang.Class,java.lang.Class", "<sample:8>", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:14>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [recursive type; UNRESOLVED -> [recursive type; UNRESOLVED] {getErasedSignature=Lgenerated/algorithm/SearchInputFac...#613#-1035893771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "5"}, {"hasContentType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawMapLikeType", "java.lang.Class", "<sample:16>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}), new String[][]{{"isThrowable", "", "5"}, {"getValueHandler", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "float"}}), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "0"}, {"getValueHandler", "", "4"}, {"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructFromCanonical", "java.lang.String", "fla\r1E-5"}}), new String[][]{{"getBindings", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "withCache", new String[]{"com.fasterxml.jackson.databind.util.LRUMap"}, new String[]{"<sample:1>"}, false), new String[][]{{"constructRawMapType", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "moreSpecificType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructParametricType", "java.lang.Class,com.fasterxml.jackson.databind.JavaType[]", "<sample:9>", "<sample:7>"}}), new String[][]{{"containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.MapLikeType", "isInterface", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.CollectionLikeType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.CollectionLikeType", "isConcrete", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.type.CollectionLikeType", "getReferencedType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [re...#694#-232606683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructParametrizedType", new String[]{"java.lang.Class", "java.lang.Class", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:3>", "<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructRawCollectionLikeType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String", ">;"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "useStaticType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.JavaType", "hasValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[array type, component type: null], hasContentType=true, hasGeneric...#513#-948890588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "classForName", new String[]{"java.lang.String", "boolean", "java.lang.ClassLoader"}, new String[]{"123456789012345678901234567890", "false", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "java.lang.reflect.Type,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "constructType", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassNotFoundException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "constructCollectionType", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.TypeFactory", "_fromArrayType", "com.fasterxml.jackson.databind.type.ClassStack,java.lang.reflect.GenericArrayType,com.fasterxml.jackson.databind.type.TypeBindings", "<sample:5>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.TypeFactory", "classForName", "java.lang.String,boolean,java.lang.ClassLoader", "[null]", "false", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "equals", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.JavaType", "containedType", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.TypeFactory", "com.fasterxml.jackson.databind.type.TypeFactory", "_constructSimple", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:17>", "<null>", "<sample:8>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.type.MapLikeType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:8>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.util.List, [recursive type; UNRESOLVED -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/util/List;, getGeneri...#574#122095152", SearchInputFactory_scaffolding.observe(actual));
 }
}
