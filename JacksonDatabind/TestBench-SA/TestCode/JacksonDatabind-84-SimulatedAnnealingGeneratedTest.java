package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:6>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:12>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false), new String[][]{{"isAbstract", "", "3"}, {"getSelfReferencedType", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<i:7>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:12>"}}, 2), new String[][]{{"findTypeParameters", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; java.lang.Object {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[recursive type; java.lang.Object, hasContentType=true, hasGenericTypes=!N...#524#1138648248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<s:>"}}), new String[][]{{"hasHandlers", "", "6"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1093834036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#419#1592989169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1093834036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#419#1592989169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 25, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#344720521", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 27, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#645#743279511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:5>", "<sample:9>", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483647"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-1073741823"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-1073741823"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-1073741823"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-1073741823"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<s:kdy>"}}, 1), new String[][]{{"getGenericSignature", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<s:r>"}}, 3), new String[][]{{"getGenericSignature", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:7V1u>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "1"}, {"getErasedSignature", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}), new String[][]{{"getRawClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 14, new String[][]{}), new String[][]{{"getRawClass", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/algori...#589#1460448165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isAbstract", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isAbstract", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isCollectionLikeType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false), new String[][]{{"getBindings", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false), new String[][]{{"getBindings", "", "2"}, {"getBoundName", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#645#743279511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1093834036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#419#1592989169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:5>", "<sample:6>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:5>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:k/ey>"}, false), new String[][]{{"isCollectionLikeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:V/ey>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "1"}}), new String[][]{{"isCollectionLikeType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withValueHandler", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toString", ""}}), new String[][]{{"getBindings", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:7.5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:1>", "<sample:4>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:xxx>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:xxxx>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:4>", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:xx+xw>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:xx+xwwE>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Hlfy>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:4>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", "java.lang.Class", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:;\rs>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:;\rs>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSelfReferencedType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a\n>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}}), new String[][]{{"add", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "toCanonical", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/algori...#686#-1946905944", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/algori...#588#460775486", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/algori...#588#803965394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/algori...#588#803965394", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:8e>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#506#-1930110140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<null>", "<null>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findSuperType", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#547#56278253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-4196416>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#547#56278253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-4196416>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#645#743279511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isReferenceType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", "java.lang.StringBuilder", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "setReference", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; genera...#507#-1691514765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasRawClass", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<sample:7>", "<sample:8>", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withTypeHandler", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false), new String[][]{{"getInterfaces", "", "7"}, {"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getBindings", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getGenericSignature", ""}}), new String[][]{{"getGenericSignature", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isPrimitive", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-128125638", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasGenericTypes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasContentType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isCollectionLikeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedType", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<s:U>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "equals", "java.lang.Object", "<b:true>"}}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentValueHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "65"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "65"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeName", "int", "65"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false), new String[][]{{"hasContentType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}}), new String[][]{{"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isContainerType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isArrayType", ""}}, 2), new String[][]{{"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, true), new String[][]{{"append", "java.lang.StringBuffer", "1"}, {"append", "long", "2"}, {"insert", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, true, 0, null, 2), new String[][]{{"append", "java.lang.StringBuffer", "1"}, {"append", "long", "2"}, {"insert", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "buildCanonicalName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "containedTypeOrUnknown", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.util.List", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", ""}}), new String[][]{{"getSuperClass", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getTypeHandler", ""}}, 1), new String[][]{{"getSuperClass", "", "7"}, {"withTypeHandler", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:0>", "<null>", "<sample:1>", "<null>"}}), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"containedType", "int", "7"}, {"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"containedType", "int", "7"}, {"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"containedType", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}), new String[][]{{"containedTypeOrUnknown", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"containedType", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}, 1), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"containedType", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}, 1), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasContentType=false, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isA...#375#1769222985", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}, 1), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasContentType=false, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isA...#375#1769222985", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}, 1), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasContentType=false, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isA...#375#1769222985", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}}), new String[][]{{"containedTypeOrUnknown", "int", "4"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasContentType=false, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isA...#375#1769222985", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isJavaLangObject", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isThrowable", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#421#34119997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isTypeOrSubTypeOf", "java.lang.Class", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1376331046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isEnumType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hasValueHandler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "withStaticTyping", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=!NullPoi...#518#1279815696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getReferencedType", ""}}), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false), new String[][]{{"setReference", "com.fasterxml.jackson.databind.JavaType", "2"}, {"isPrimitive", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=!NullPointerExcep...#548#1805935830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1663445082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "isFinal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[recursive type; UNRESOLVED {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[recursive type; UNRESOLVED, hasContentType=true, hasGenericTypes=false, h...#420#-1320255174", SearchInputFactory_scaffolding.receiverState());
 }
}
