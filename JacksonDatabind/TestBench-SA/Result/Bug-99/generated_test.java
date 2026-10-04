package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, true), new String[][]{{"getReferencedType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<sample:2>", "<sample:4>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<$0><$0>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[reference type, class java.lang.Object<$0><$0>], hasCo...#457#-1332920581", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "-1"}}), new String[][]{{"hasGenericTypes", "", "1"}, {"isConcrete", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:0>", "<null>", "<sample:1>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.String><[array type, component type: $0]>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_s...#644#786338706", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:9>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", ""}}), new String[][]{{"withContentTypeHandler", "java.lang.Object", "3"}, {"withStaticTyping", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#536#-930264821", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", ""}}, 1), new String[][]{{"isReferenceType", "", "1"}, {"findTypeParameters", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<i:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<b:false>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedType", "int", "0"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#536#-930264821", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"withTypeHandler", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#1599760004", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"withTypeHandler", "java.lang.Object", "7"}, {"isPrimitive", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"withTypeHandler", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Integer><[array type, component type: $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<[$0>;, getTypeName=[referenc...#516#1662106211", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algo...#671#1316677497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, null, 2), new String[][]{{"isCollectionLikeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<sample:3>"}}, 1), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", "java.lang.Class", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<$0><$0>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[reference type, class java.lang.Object<$0><$0>], hasCo...#457#-1332920581", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", "int", "-12"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#559#1509388971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:t>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", "int", "2147483647"}}, 2), new String[][]{{"hasGenericTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 2), new String[][]{{"hasGenericTypes", "", "6"}, {"hasValueHandler", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:->"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}}, 1), new String[][]{{"isMapLikeType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}}, 3), new String[][]{{"isCollectionLikeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<$0><$0>] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lg...#599#-2112078130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "-1"}}, 1), new String[][]{{"hasGenericTypes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "-1"}}, 1), new String[][]{{"getContentValueHandler", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:1073741823>"}}, 1), new String[][]{{"getContentValueHandler", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2147483544>"}}, 1), new String[][]{{"isInterface", "", "4"}, {"getSuperClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algo...#671#-1677319400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", "java.lang.Class", "<sample:2>"}}, 1), new String[][]{{"isArrayType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}}, 1), new String[][]{{"isArrayType", "", "3"}, {"getTypeHandler", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<null>", "<sample:0>", "<empty>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"isConcrete", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<empty>", "<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, true, 0, null, 2), new String[][]{{"insert", "int,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljasampleva/lang/String", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, true, 0, null, 2), new String[][]{{"insert", "int,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("samsamplepleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "false"}, true, 0, null, 2), new String[][]{{"insert", "int,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgesamplenerated/algorithm/SearchInputFactory_scaffolding$GenericSub", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericBase;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, true, 0, null, 3), new String[][]{{"append", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "false"}, true, 0, null, 3), new String[][]{{"append", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("I-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Tke7yL>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"isConcrete", "", "5"}, {"getInterfaces", "", "1"}, {"remove", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:6>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:0>"}}), new String[][]{{"indexOf", "java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:0>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false), new String[][]{{"isMapLikeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<null>", "<sample:3>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#536#-930264821", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", "java.lang.StringBuilder", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "-1"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Integer<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Integer;, getGenericSignature=Ljava/lang/Integer<Ljava/lang/Object;>;,...#535#-1149237754", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false), new String[][]{{"withContentValueHandler", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, true), new String[][]{{"withTypeHandler", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#1599760004", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#1748275484", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}}), new String[][]{{"getContentValueHandler", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:kyea{agx>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}}), new String[][]{{"getContentValueHandler", "", "6"}, {"getErasedSignature", "java.lang.StringBuilder", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:kzea{agx>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#536#-930264821", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algo...#671#1316677497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{}), new String[][]{{"toCanonical", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"toCanonical", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase<java.lang.Object>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}}), new String[][]{{"getParameterSource", "", "0"}, {"getRawClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}}), new String[][]{{"getParameterSource", "", "0"}, {"getRawClass", "", "4"}, {"getContentType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#469#-736751291", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false), new String[][]{{"containedTypeOrUnknown", "int", "0"}, {"getReferencedType", "", "4"}, {"getContentTypeHandler", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", "int", "-2147483648"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "forcedNarrowBy", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isThrowable", ""}}), new String[][]{{"containedTypeOrUnknown", "int", "0"}, {"getReferencedType", "", "4"}, {"getContentTypeHandler", "", "1"}, {"withHandlersFrom", "com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Lgenerated/algo...#671#1316677497", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<sample:3>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<empty>", "<sample:6>", "<sample:0>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.String<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Lja...#560#1284374490", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getAnchorType", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object<$0>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#559#1509388971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:,>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentTypeHandler", "java.lang.Object", "<sample:7>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}), new String[][]{{"hasHandlers", "", "6"}, {"hasValueHandler", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isCollectionLikeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}}), new String[][]{{"isCollectionLikeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "useStaticType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.String] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String;, getTypeName=[simple type, class java.lang.String], hasContentType=false, hasGeneri...#435#1283031983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "buildCanonicalName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAnchorType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "constructUnsafe", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"findTypeParameters", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getRawClass", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"withContentTypeHandler", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"containedType", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", "int", "-1"}}), new String[][]{{"hasGenericTypes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isAbstract", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", ""}}), new String[][]{{"isEnumType", "", "0"}, {"isMapLikeType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findSuperType", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", "java.lang.Class", "<sample:2>"}}), new String[][]{{"containedType", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasRawClass", "java.lang.Class", "<sample:2>"}}), new String[][]{{"isArrayType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1063877012", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1063877012", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "refine", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]"}, new String[]{"<sample:2>", "<null>", "<sample:0>", "<empty>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_bogusSuperClass", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true), new String[][]{{"getGenericSignature", "", "2"}, {"forcedNarrowBy", "java.lang.Class", "4"}, {"getErasedSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false), new String[][]{{"getGenericSignature", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false), new String[][]{{"getSuperClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Object;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true), new String[][]{{"insert", "int,float", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, true), new String[][]{{"append", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/util/List;-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, true), new String[][]{{"append", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, true), new String[][]{{"append", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/Integer-Infinity", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "equals", "java.lang.Object", "<i:-16>"}}), new String[][]{{"isConcrete", "", "5"}, {"getInterfaces", "", "1"}, {"remove", "java.lang.Object", "7"}, {"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:16777192>"}, false, 0, null, 3), new String[][]{{"getGenericSignature", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<i:1>"}}, 3), new String[][]{{"getGenericSignature", "", "5"}, {"hasValueHandler", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isPrimitive", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasContentType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"2"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "_classSignature", new String[]{"java.lang.Class", "java.lang.StringBuilder", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLgenerated/algorithm/SearchInputFactory_scaffolding$GenericLeaf;", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}}), new String[][]{{"isJavaLangObject", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isReferenceType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isReferenceType", "", "5"}, {"containedTypeOrUnknown", "int", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"isReferenceType", "", "5"}, {"containedTypeOrUnknown", "int", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getErasedSignature", "java.lang.StringBuilder", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}, 2), new String[][]{{"containedTypeName", "int", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}, 2), new String[][]{{"containedTypeName", "int", "3"}, {"isTypeOrSubTypeOf", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:-61>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", "com.fasterxml.jackson.databind.JavaType", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}}), new String[][]{{"containedTypeName", "int", "3"}, {"isTypeOrSubTypeOf", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isConcrete", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ljava/lang/Object<Ljava/lang/Object<$0>;>;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeName", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "upgradeFrom", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, true), new String[][]{{"isEnumType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#594#1567312813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", new String[]{}, new String[]{}, false), new String[][]{{"isPrimitive", "", "7"}, {"getGenericSignature", "java.lang.StringBuilder", "6"}, {"append", "char[],int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getContentValueHandler", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getInterfaces", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.TypeBindings", actual.getClass().getName());
  assertEquals("<> {isEmpty=true, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<empty>"}}), new String[][]{{"hasUnbound", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isJavaLangObject", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:1>"}}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isTypeOrSubTypeOf", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getAnchorType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#561#-621252237", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<s:Xkey>"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeName", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<s:Xkey>"}}, 1), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeName", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<s:Xkey>"}}, 1), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withTypeHandler", "java.lang.Object", "<s:Xkey>"}}, 1), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeName", "int", "5"}, {"hasContentType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeName", "int", "5"}, {"hasContentType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withValueHandler", "java.lang.Object", "<i:19>"}}), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getContentTypeHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", ""}}, 2), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeName", "int", "5"}, {"getAnchorType", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", ""}}, 2), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withContentType", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "hasValueHandler", ""}}, 2), new String[][]{{"withContentValueHandler", "java.lang.Object", "5"}, {"containedTypeName", "int", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getKeyType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "withStaticTyping", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "containedTypeCount", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "findTypeParameters", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", ""}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getValueHandler", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sampleLjava/lang/Object<Ljava/lang/Object<$0>;>;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"-2147418112"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isReferenceType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "containedType", new String[]{"int"}, new String[]{"-13"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object<$0>>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "toCanonical", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object<java.lang.Object>", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getBindings", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:-15>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isMapLikeType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "withContentValueHandler", "java.lang.Object", "<i:130>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getContentType", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "isFinal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object><[simple type, class java.lang.Object]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Ljava/lang/Object;>;, ge...#535#431121290", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"forcedNarrowBy", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getReferencedType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "construct", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType[]", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>", "<sample:6>", "<sample:2>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.type.ReferenceType", "refine", "java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[]", "<empty>", "<sample:4>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.type.ReferenceType", "getSuperClass", ""}, {"com.fasterxml.jackson.databind.type.ReferenceType", "_narrow", "java.lang.Class", "<null>"}}), new String[][]{{"useStaticType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[reference type, class java.lang.Object<java.lang.Object<$0>><[collection type; class java.lang.Object, contains $0]>] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<Lja...#560#579636770", SearchInputFactory_scaffolding.receiverState());
 }
}
