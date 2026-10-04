package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0,$0>><[map-like type; class java.lang.Object, $0 -> $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava...#560#259677966", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"getGenericSignature", "java.lang.StringBuilder", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf<Ljava/lang/Object<$0>;>;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false), new String[][]{{"containedTypeName", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Integer><[array type, component type: $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<[$0>;, getTypeName=[referenc...#517#1002467596", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:2>", "<sample:3>", "<empty>", "<sample:6>"}, true), new String[][]{{"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "5"}, {"isReferenceType", "", "7"}, {"getContentType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#536#-930264821", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}}, 1), new String[][]{{"getAnchorType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:3>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.String<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:8>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", ""}}), new String[][]{{"getBindings", "", "7"}, {"withUnboundVariable", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<empty>", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Integer<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;,...#538#-1392736209", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 2, new String[][]{}, 3), new String[][]{{"isEnumType", "", "3"}, {"isReferenceType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedType", "int", "-51"}}, 1), new String[][]{{"isAbstract", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"42"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-67108864>"}, false, 0, null, 2), new String[][]{{"useStaticType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-2147483520"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:6>", "<null>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<null>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algor...#670#-1453935471", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3), new String[][]{{"isConcrete", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:Fb>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>", "<sample:6>", "<sample:0>", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, null, 1), new String[][]{{"getBindings", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-0.75>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}}, 3), new String[][]{{"append", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;false", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2), new String[][]{{"getValueHandler", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isThrowable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<d:3.1190000000000007>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", "java.lang.Class", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "0"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", "java.lang.Class", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getBoundName", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#559#1509388971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}}, 3), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object<$0>;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1063877012", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-268435454>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedType", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", "java.lang.StringBuilder", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class int<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=I, getGenericSignature=I<Ljava/lang/Object;>;, getTypeName=[reference type, class int<java.lang...#488#-1891190182", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", "java.lang.Class", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object<$0>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>", "<sample:4>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Lgenerated/algorithm/SearchInputFact...#649#-1318479101", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:1>"}, true), new String[][]{{"isAbstract", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.String<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Lja...#560#1284374490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object<$0>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#1748275484", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#595#1857139552", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"getBindings", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isEnumType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1063877012", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algo...#671#-1677319400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false), new String[][]{{"getAnchorType", "", "3"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", "int", "524289"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Integer<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<...#563#428702278", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>", "<sample:3>", "<sample:7>"}, true), new String[][]{{"findTypeParameters", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"isPrimitive", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:2>", "<sample:10>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}}), new String[][]{{"hasValueHandler", "", "4"}, {"hasGenericTypes", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", ""}}), new String[][]{{"isAbstract", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", ""}}), new String[][]{{"hasHandlers", "", "0"}, {"isAnchorType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#594#1567312813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"containedTypeCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"hasRawClass", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#559#1509388971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", "int", "-37"}}), new String[][]{{"findSuperType", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<sample:8>"}}), new String[][]{{"hasContentType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<null>", "<sample:2>", "<sample:2>", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:7>", "<empty>", "true"}, true), new String[][]{{"indexOf", "java.lang.String,int", "7"}, {"insert", "int,double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", new String[]{"int"}, new String[]{"67108867"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"containedTypeCount", "", "1"}, {"isContainerType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", ""}}), new String[][]{{"isCollectionLikeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getBoundType", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"containedType", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:3>"}}), new String[][]{{"getRawClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:3>", "<sample:2>", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-41>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#559#1509388971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}}), new String[][]{{"withContentTypeHandler", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#1748275484", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false), new String[][]{{"containedTypeName", "int", "7"}, {"findSuperType", "java.lang.Class", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false), new String[][]{{"containedTypeCount", "", "6"}, {"getErasedSignature", "java.lang.StringBuilder", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false), new String[][]{{"isJavaLangObject", "", "3"}, {"getContentTypeHandler", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}), new String[][]{{"toCanonical", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<$0>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false), new String[][]{{"findTypeParameters", "java.lang.Class", "3"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}}), new String[][]{{"getReferencedType", "", "6"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:1>", "<sample:4>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}}), new String[][]{{"findTypeParameters", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false), new String[][]{{"forcedNarrowBy", "java.lang.Class", "5"}, {"getErasedSignature", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:3>"}, true), new String[][]{{"isInterface", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 7, new String[][]{}), new String[][]{{"isInterface", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getTypeName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:10>"}, true), new String[][]{{"getBindings", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"containedTypeCount", "", "7"}, {"getErasedSignature", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/String;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyListIterator", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false), new String[][]{{"asKey", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false), new String[][]{{"hasValueHandler", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false), new String[][]{{"withContentTypeHandler", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Lgenerated/algorithm/SearchInputFacto...#649#-174274787", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{}), new String[][]{{"isReferenceType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"isTypeOrSubTypeOf", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<s:a>"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", ""}}), new String[][]{{"append", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object<Ljava/lang/Object;>;4", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false), new String[][]{{"getBoundType", "int", "5"}, {"asKey", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings$AsKey", actual.getClass().getName());
  assertEquals("java.util.List<>", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false), new String[][]{{"getBindings", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false), new String[][]{{"getBindings", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<s:kd>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}}), new String[][]{{"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:0>"}, true), new String[][]{{"isInterface", "", "5"}, {"getInterfaces", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Arrays$ArrayList", actual.getClass().getName());
  assertEquals("[$0, [simple type, class java.lang.Object]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false), new String[][]{{"getContentType", "", "5"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class int, contains $0] {getErasedSignature=I, getGenericSignature=I<$0>;, getTypeName=[collection type; class int, contains $0], hasContentType=true, hasGenericTypes=false, hasHandl...#410#1785135020", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false), new String[][]{{"hasHandlers", "", "7"}, {"containedTypeCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"isEnumType", "", "0"}, {"getContentTypeHandler", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 2, new String[][]{}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "0"}, {"isMapLikeType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getSuperClass", "", "7"}, {"isConcrete", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<empty>", "<sample:3>", "true"}, true), new String[][]{{"insert", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lj3ava/lang/String;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}}), new String[][]{{"getContentType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", ""}}), new String[][]{{"getRawClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true), new String[][]{{"getTypeName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{}, 3), new String[][]{{"withContentValueHandler", "java.lang.Object", "3"}, {"isPrimitive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isContainerType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:0>"}}), new String[][]{{"getErasedSignature", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"getBindings", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false), new String[][]{{"getContentType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", "java.lang.Class", "<sample:3>"}}, 1), new String[][]{{"withContentTypeHandler", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algo...#671#1316677497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isEnumType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>", "<null>", "<sample:4>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, true), new String[][]{{"indexOf", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:0>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
